package com.example.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.domain.Member;
import com.example.demo.model.service.AddMemberRequest;
import com.example.demo.model.service.MemberService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller // 컨트롤러 어노테이션 명시
public class MemberController
{
    @Autowired
    MemberService memberService;

    @GetMapping("/join_new") // 회원 가입 페이지 연결
    public String join_new() {
        return "join_new"; // .HTML 연결
    }  

   @PostMapping("/api/members")
    public String addmembers(@Valid @ModelAttribute AddMemberRequest request,
                         BindingResult bindingResult,
                         Model model) {

    if (bindingResult.hasErrors()) {
        model.addAttribute("error", bindingResult.getFieldError().getDefaultMessage());
        return "join_new"; // 다시 입력 페이지로 이동
    }

    memberService.saveMember(request);
    return "join_end";
}

    @GetMapping("/member_login") // 로그인 페이지 연결
    public String member_login() {
        return "login"; // .HTML 연결
    }

    @PostMapping("/api/login_check")
    public String checkMembers(
        @ModelAttribute AddMemberRequest request,
        Model model,
        HttpServletRequest request2) {

    try {
        //로그인 검증
        Member member = memberService.loginCheck(
                request.getEmail(),
                request.getPassword());

        //사용자별 세션 생성 (기존 세션 유지)
        HttpSession session = request2.getSession(true);

        //사용자 고유 정보 세션에 저장
        session.setAttribute("loginEmail", member.getEmail());
        session.setAttribute("loginName", member.getName());

        return "redirect:/board_list";

    } catch (IllegalArgumentException e) {
        model.addAttribute("error", e.getMessage());
        return "login";
    }
    }

    @GetMapping("/api/logout")
    public String member_logout(
        HttpServletRequest request2,
        HttpServletResponse response) {

    HttpSession session = request2.getSession(false);

    if (session != null) {
        session.invalidate(); // ✅ 현재 사용자만 로그아웃
    }

    // ✅ 쿠키 삭제
    Cookie cookie = new Cookie("JSESSIONID", null);
    cookie.setPath("/");
    cookie.setMaxAge(0);
    response.addCookie(cookie);

    return "redirect:/member_login";
}
}
    
