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

    - 마지막에는 /hello로 이동할 수 있는 링크를 추가하여 첫 번째 페이지로 돌아갈 수 있게 구성

 hello.html(코드 수정) - 기존에 자기 자신으로 연결되던 링크를 /hello2로 수정하여, 두 번째 페이지(hello2.html)로 이동할 수 있게 변경

 3주차 연습문제

 about_detailed.html(코드 수정) 
 
 - javascript:void(0); → 링크 클릭 시 페이지가 새로고침되지 않게 함

 - onclick="confirmClose()" → 버튼 클릭 시 JavaScript 함수 confirmClose()를 실행

main.js (코드 추가) 

 - confirmClose() 함수를 사용하여 창을 닫기 전에 확인 메시지를 띄우고 확인 버튼 클릭 시 현재 창을 닫도록 구현한 기능을 수행

 - window.close()에서 브라우저 창을 닫는 동작을 수행

## 4주차 수업완료

 - 프로필 수정 및 데이터베이스 연동

 - 엔티티(데이터베이스 구조 작성), 레포지토리(데이터베이스 제이 기능 작성), 서비스(주요 기능 작성), 컨트로러(사용자 요청/응답 기능 작성), 뷰(화면 출력 화면 작성) 클래스 추가하여 테스트 페이지 작성

## 5주차 수업완료

 - 블로그 게시판 조회 및 글쓰기 기능 구현 

 - list.isPresent()가 false면 DB에서 해당 id를 가진 글이 없을 때 오류 페이지로 이동하는 기능 구현 

## 10/14 4주차 연습문제 완료 
 
 DemoController.java(코드 수정) - 이전엔 한 명의 사용자만 모델에 담았던 걸 사용자 2,3을 추가하여 사용자 데이터를 한 번에 조회하고 모델에 전달하도록 함

 testdb.html(코드 수정) 

 - 새로운 사용자2,3의 정보를 표시하기 위한 <p> 태그 4줄 추가

 - 기존에는 data4(홍길동) 데이터만 보여줬지만 이제 컨트롤러에서 사용자2,3(아저씨, 꾸러기)을 추가로 넘겨주기 때문에 HTML에서도 이들을 각각 출력하도록 수정

## 6주차 수업완료

 - 블로그 게시판 수정 및 삭제 기능 구현 

## 10/24 5주차 연습문제 완료
 
 BlogRestController.java(주석 처리) - 중복을 방지하기 위해 주석 처리

 BlogController(코드 수정) 
 
    - 기존의 BlogRestController.java 소스코드를 가져와 ResponseEntity<Article> → String 변경하여 "redirect:/article_list" 반환 가능하도록 함

    - "redirect:/article_list" 추가하여 저장 후 페이지 자동 전환하게 함


## 10/25 6주차 연습문제 완료 

 article_error2.html (파일 생성) 

   - 기존의 에러 페이지와 동일한 디자인을 사용하며, 링크 매개변수로 정수가 아닌 문자열이 전달될 때 잘못된 접근임을 알리는 전용 에러 페이지로 사용

 BlogController.java(코드 수정)

   - @ControllerAdvice를 통해 이러한 타입 변환 예외를 외부에서 처리하도록 분리함

   - 존재하지 않는 게시글은 article_error.html, 잘못된 매개변수 형식은 article_error2.html을 각각 표시하도록 변경

 BlogControllerAdvice.java(파일 생성)

   - BlogControllerAdvice 클래스는 @ControllerAdvice를 이용하여 전역 예외를 처리하는 역할을 함

   - 링크 매개변수가 정수가 아닐 경우 발생하는 MethodArgumentTypeMismatchException을 처리하여 사용자를 article_error2.html로 안내하고 그 외의 일반적인  예외는       article_error.html로 이동시켜 안정적인 예외 처리를 구현  

## 10주차 수업완료   

## 11/12 7주차(10주차) 연습문제 완료 

 AddArticleRequest.java(코드 수정)

  - title과 content 이외 나머지 변수 추가 및 Article toEntity() 주석처리

 board_edit.html(파일 생성)

  - 기존의 article_edit.html 코드를 가져와 article -> board로 수정 

 BlogController.java(코드 수정)

  - board_edit으로 가는 맵핑 등록, 수정 후 목록 페이지(board_list)로 가는 맵핑 작성 

 BlogService(코드 수정)

  - request.getUser() != null ? request.getUser() : board.getUser()  요청에서 user 값이 null이면 기존 board 객체의 user 값을 그대로 사용 다른 필드도 동일하게 null 체크 후 기존 값 유지.

  - 추가된 필드가 null이어도 DB에 null로 들어가는 걸 방지할 수 있음. 즉, nullable = false 컬럼 때문에 발생할 수 있는 에러를 예방

## 11주차 수업완료 

## 11/19 9주차(11주차) 연습문제 완료 - 게시판 글 번호 

  BlogController.java(코드 수정) 
  
   - board_list 메소드에서 현재 페이지와 페이지 크기를 이용해 해당 페이지의 첫 번째 번호를 의미하는 startNum을 계산하여 View로 전달하도록 수정

   - startNum = (page * pageSize) + 1 이 값은 HTML에서 반복문과 함께 사용되어 페이지마다 번호가 1부터 다시 시작하는 형태로 출력

  board_list.html(코드 수정)

   - 기존에는 <td th:text="${board.id}"></td> 형태로 DB의 id 값을 출력하고 있었으나, 이를 페이지 번호 기준으로 출력되도록 수정
   
   - iter.index(반복 인덱스)를 이용해 startNum + iter.index 형태로 번호를 출력

   - 이를 통해 페이지가 바뀔 때마다 번호가 자동으로 증가하며 사용자에게 직관적인 번호 목록을 제공