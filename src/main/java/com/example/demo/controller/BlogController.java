package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.domain.Board;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService;  // 최상단 서비스 클래스 연동 추가

import jakarta.servlet.http.HttpSession;

import java.util.Optional;

@Controller // 컨트롤러 어노테이션 명시
public class BlogController
{
    @Autowired
    BlogService blogService; // DemoController 클래스 아래 객체 생성
    // 하단에 맵핑 이어서 추가

    // @GetMapping("/article_list") // 게시판 링크 지정
    // public String article_list(Model model) {
    //     List<Article> list = blogService.findAll(); // 게시판 리스트
    //     model.addAttribute("articles", list); // 모델에 추가
    //     return "article_list"; // .HTML 연결
    // }

    // @GetMapping("/article_edit/{id}")
    // public String article_edit(Model model, @PathVariable Long id) {
    //     // 정수가 아닌 경우는 ControllerAdvice에서 처리됨
    //     Optional<Article> articleOpt = blogService.findById(id);

    //     if (articleOpt.isPresent()) {
    //         model.addAttribute("article", articleOpt.get());
    //         return "article_edit";
    //     } else {
    //         // 존재하지 않는 글일 때
    //         return "error_page/article_error";
    //     }
    // }

    // @PutMapping("/api/article_edit/{id}")
    // public String updateArticle(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
    //     blogService.update(id, request);
    //     return "redirect:/article_list"; // 글 수정 이후 .html 연결
    // }

    // @DeleteMapping("/api/article_delete/{id}")
    // public String deleteArticle(@PathVariable Long id) {
    //     blogService.delete(id);
    //     return "redirect:/article_list";
    // }

    // @PostMapping("/api/articles")
    // public String addArticle(@ModelAttribute AddArticleRequest request) {
    //     blogService.save(request);
    //     return "redirect:/article_list"; // 저장 후 목록 페이지로 이동
    // }

     @GetMapping("/favicon.ico")
    public void favicon() {
        // 아무 동작 없음
    }

    // @GetMapping("/board_list") // 새로운 게시판 링크 지정
    // public String board_list(Model model) {
    //     List<Board> list = blogService.findAll(); // 게시판 전체 리스트, 기존 Article에서 Board로 변경됨
    //     model.addAttribute("boards", list); // 모델에 추가
    //     return "board_list"; // .HTML 연결
    // }

    @GetMapping("/board_list")
    public String board_list(Model model,
                         @RequestParam(defaultValue = "0") int page,
                         @RequestParam(defaultValue = "") String keyword, HttpSession session) {
                         String userId = (String) session.getAttribute("userId"); // 세션 아이디 존재 확인
                         String email = (String) session.getAttribute("email"); // 세션에서 이메일 확인

                         if (userId == null) {
                            return "redirect:/member_login"; // 로그인 페이지로 리다이렉션
                         }
                         System.out.println("세션 userId: " + userId); // 서버 IDE 터미널에 세션 값 출력

    int pageSize = 5; // 한 페이지 게시글 수
    PageRequest pageable = PageRequest.of(page, pageSize);
    Page<Board> list;

    if (keyword.isEmpty()) {
        list = blogService.findAll(pageable);
    } else {
        list = blogService.searchByKeyword(keyword, pageable);
    }

    //페이지 번호 계산
    int startNum = (page * pageSize) + 1;

    model.addAttribute("boards", list);
    model.addAttribute("totalPages", list.getTotalPages());
    model.addAttribute("currentPage", page);
    model.addAttribute("keyword", keyword);

    //번호 전달
    model.addAttribute("startNum", startNum);
    model.addAttribute("email", email); // 로그인 사용자(이메일)

    return "board_list";
    }
    @GetMapping("/board_write")
    public String board_write() {
        return "board_write";
    }

    @GetMapping("/board_view/{id}") // 게시판 링크 지정
    public String board_view(Model model, @PathVariable Long id) {
        Optional<Board> list = blogService.findById(id); // 선택한 게시판 글

        if (list.isPresent()) {
            model.addAttribute("boards", list.get()); // 존재할 경우 실제 Board 객체를 모델에 추가
        } else {
            // 처리할 로직 추가 (예: 오류 페이지로 리다이렉트, 예외 처리 등)
            return "/error_page/article_error"; // 오류 처리 페이지로 연결
        }
        return "board_view"; // .HTML 연결
        }
    @GetMapping("/board_edit/{id}")
    public String board_edit(Model model, @PathVariable Long id) {
        Optional<Board> boardOpt = blogService.findById(id);

        if (boardOpt.isPresent()) {
            model.addAttribute("board", boardOpt.get()); // Board 객체를 모델에 추가
            return "board_edit"; // 수정 페이지로 이동
        } else {
            return "error_page/article_error"; // 없는 글이면 에러 페이지
        }
        }

    @PutMapping("/api/board_edit/{id}")
    public String updateBoard(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
        blogService.update(id, request); // 수정 로직 (Article과 동일 구조 사용)
        return "redirect:/board_list"; // 수정 후 목록 페이지로 이동
        }    

    @PostMapping("/api/boards") // 글쓰기 게시판 저장
    public String addboards(@ModelAttribute AddArticleRequest request) {
        blogService.save(request);
        return "redirect:/board_list"; // .HTML 연결
        }
    @DeleteMapping("/api/board_delete/{id}")
    public String deleteBoard(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/board_list";
}
}
    
