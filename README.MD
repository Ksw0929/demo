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

 BlogController.java(코드 수정) 
 
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

 BlogService.java(코드 수정)

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

## 11/22 9주차(11주차) 연습문제 완료 - 삭제 버튼 구현 

  BlogController.java(코드 추가) - DeleteMapping 추가하여 삭제 기능 구현 

## 12주차 수업완료 

## 13주차 수업완료 

## 11/29 12주차 연습문제 완료 - 입력값 필터링 
  
   pom.xml (코드 추가) - Vaildation 의존성 모듈 추가 

   AddMemberRequest.java (코드 추가) 

   - 회원가입 시 이름, 이메일, 비밀번호, 나이, 전화번호, 주소 등 모든 필수 입력값에 공백(빈 문자열) 이 들어오지 않도록 하기 위해 @NotBlank 어노테이션을 추가

   - 이름 필드에는 특수문자나 숫자를 입력하는 오류를 막기 위해 ^[a-zA-Z가-힣]+$ 정규식을 사용한 @Pattern 어노테이션 추가

   - 이메일 입력 값이 단순 문자열이 아니라 실제 이메일 형식(aaa@bbb.com ) 으로 구성되었는지 확인하기 위해 @Email 어노테이션을 추가

   - 비밀번호에는 대문자 1개 이상, 소문자 1개 이상 , 숫자 1개 이상, 8글자 이상을 만족하도록 @Pattern 어노테이션 추가

   - 19세 이상 ~ 90세 이하일 경우에만 회원가입이 가능하도록 @Pattern 어노테이션 추가

   - 휴대전화번호, 주소 추가적인 검증은 없지만 공백 방지를 위해 @NotBlank 어노테이션 추가 

   MemberController.java (코드 추가) - @Valid 를 이용해 AddMemberRequest의 검증을 실행함 bindingResult.hasErrors() 를 이용해 검증 실패 여부 확인 실패 시 사용자에게 오류 메시지 출력 후 다시 입력하도록 유도하게 작성

   join_new.html - 컨트롤러에서 전달한 error 메시지를 사용자에게 보여줌. 유효성 검증 실패 시 어떤 부분이 문제인지 알 수 있게 코드 추가 

## 11/30 13주차 연습문제 완료 - 작성자 게시글 수정,삭제 구현 완료 

  BlogController.java(코드 추가) 
   
   - String email = (String) session.getAttribute("email"); 
     request.setUser(email); 
     
   - 위 코드를 추가하여 세션에서 현재 로그인한 사용자의 이메일을 꺼낸 뒤, 해당 값을 게시글 작성자(user) 필드에 저장하여 저장된 게시글의 작성자는 GUEST가 아닌 로그인한 이메일로 기록되게 함

   - String loginEmail = (String) session.getAttribute("email");
     model.addAttribute("loginEmail", loginEmail);

   - 위 코드를 추가하여 HTML 파일에서 로그인한 사용자와 글 작성자의 이메일을 비교하여 작성자와 로그인 사용자가 동일할 때만 버튼이 표시되도록 조건문을 추가

   board_view.html - th:if 조건문을 사용하여 로그인한 사용자와 게시글 작성자가 동일한 경우에만 수정, 삭제 버튼이 표시하도록 변경 
  
## 14주차 수업완료

## 12/5 14주차 연습문제 완료 - 세션처리와 파일업로드 

 MemberController.java(코드 수정)

  - 로그인 시 request.getSession(true)를 사용하여 사용자별 세션을 생성

  - 로그아웃 시 session.invalidate()를 사용하여 현재 사용자 세션만 삭제

  - JSESSIONID 쿠키를 함께 제거하여 완전 로그아웃 처리를 구현

  - 기존 세션을 강제로 제거하지 않아 다중 사용자 동시 로그인이 가능하도록 개선

 FileController.java(코드 수정)

  - Paths.get()과 Files.exists(), Files.createDirectories() 메서드를 사용하여 파일 업로드 경로가 존재하지 않을 경우 자동으로 폴더가 생성되도록 예외 처리를 추가

  - UUID.randomUUID() 메서드를 이용하여 파일명 앞에 고유한 UUID 값을 추가함으로써 같은 이메일로 여러 번 업로드하더라도 파일명이 중복되지 않도록 처리
  
  - 이를 통해 동일한 사용자 또는 동일한 이메일로 파일을 여러 번 업로드하더라도 기존 파일이 덮어써지는 문제를 방지할 수 있도록 구현