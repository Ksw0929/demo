package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.model.domain.Article;
import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.TestService;
import com.example.demo.model.service.BlogService;  // 최상단 서비스 클래스 연동 추가
import java.util.List;

@Controller // 컨트롤러 어노테이션 명시
public class BlogController
{
    @Autowired
    BlogService blogService; // DemoController 클래스 아래 객체 생성
    // 하단에 맵핑 이어서 추가

    @GetMapping("/article_list") // 게시판 링크 지정
    public String article_list(Model model) {
        List<Article> list = blogService.findAll(); // 게시판 리스트
        model.addAttribute("articles", list); // 모델에 추가
        return "article_list"; // .HTML 연결
    }
}
    
