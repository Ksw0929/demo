package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice(assignableTypes = BlogController.class)
public class BlogControllerAdvice {

    // 매개변수가 정수가 아닐 경우 (예: /article_edit/abc)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleTypeMismatch(MethodArgumentTypeMismatchException ex, Model model) {
        model.addAttribute("errorMessage", "잘못된 매개변수 형식입니다: " + ex.getValue());
        return "error_page/article_error2"; // 새로운 에러 페이지
    }

    // 기타 예외 처리 (선택 사항)
    @ExceptionHandler(Exception.class)
    public String handleGeneralException(Exception ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "error_page/article_error";
    }
}