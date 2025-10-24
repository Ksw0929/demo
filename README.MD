# C# 소스 코드 깃허브

 새로운 시작! C#의 세계로 떠나보아요~

## Getting Started

 This project is a starting point for a C# application.

 A few resources to get you started if this is your first Flutter project:

 - [프로젝트 메인 주소](https://github.com/Ksw0929/demo)

## 2주차 수업 - 환결설정 및 깃 허브 연동, C# 기초 살펴보기

 - 실행 및 깃 허브 연동 확인 완료

## 3주차 수업 완료 
 
 - 부트스트랩 5 기반의 디자인을 가져와 개인 포트폴리오 생성 및 작성

 - about_detailed.html 파일을 생성하여 상세 페이지 작성

 - DemoController.java(코드 추가) - 상세 페이지로 갈 수 있는 맵핑 추가 

## 9/23 2,3주차 연습문제 완료 

 2주차 연습문제

 DemoController.java(코드 추가) - hello2.html를 통해 데이터를 화면에 전달할 수 있게 하기 위한 hello2 페이지 맵핑, 5개의 속성 추가

 hello2.html(파일 생성) 
    
    - hello2.html은 DemoController의 /hello2 매핑 메서드와 연결된 페이지로, 컨트롤러에서 Model을 통해 전달된 (data, hi, today,weather,good)를 <p th:text="${변수명}"> 형태로 화면에 표시

    -마지막에는 /hello로 이동할 수 있는 링크를 추가하여 첫 번째 페이지로 돌아갈 수 있게 구성하였다.

 hello.html(코드 수정) - 기존에 자기 자신으로 연결되던 링크를 /hello2로 수정하여, 두 번째 페이지(hello2.html)로 이동할 수 있게 변경하였다.

 3주차 연습문제

 about_detailed.html(코드 수정) 
 
 - javascript:void(0); → 링크 클릭 시 페이지가 새로고침되지 않게 함

 - onclick="confirmClose()" → 버튼 클릭 시 JavaScript 함수 confirmClose()를 실행

main.js (코드 추가) 

 - confirmClose() 함수를 사용하여 창을 닫기 전에 확인 메시지를 띄우고 확인 버튼 클릭 시 현재 창을 닫도록 구현한 기능을 수행

 - window.close()에서 브라우저 창을 닫는 동작을 수행

## 4주차 수업완료

## 5주차 수업완료

## 10/14 4주차 연습문제 완료 

## 7주차 수업완료

## 10/24 5주차 연습문제 완료
 
 BlogRestController.java(주석 처리) - 중복을 방지하기 위해 주석 처리

 BlogController(코드 수정) 
 
    - 기존의 BlogRestController.java 소스코드를 가져와 ResponseEntity<Article> → String 변경하여 "redirect:/article_list" 반환 가능하도록 함

    - "redirect:/article_list" 추가하여 저장 후 페이지 자동 전환하게 함


