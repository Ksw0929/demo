package com.example.demo.model.service;

import lombok.*; // 어노테이션 자동 생성
import com.example.demo.model.domain.Member;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성
public class AddMemberRequest {
    @NotBlank(message = "이름은 공백일 수 없습니다.")
    @Pattern(regexp = "^[a-zA-Z가-힣]+$", message = "이름은 특수문자를 포함할 수 없습니다.")
    private String name;

    @NotBlank(message = "이메일은 공백일 수 없습니다.")
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;

    @NotBlank(message = "비밀번호는 공백일 수 없습니다.")
    @Pattern(
        regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$",
        message = "비밀번호는 8자리 이상, 대문자/소문자/숫자를 포함해야 합니다."
    )
    private String password;

    @NotBlank(message = "나이는 공백일 수 없습니다.")
    @Pattern(regexp = "^(19|[2-8][0-9]|90)$", message = "나이는 19세 이상 90세 이하만 가능합니다.")
    private String age;

    @NotBlank(message = "전화번호는 공백일 수 없습니다.")
    private String mobile;

    @NotBlank(message = "주소는 공백일 수 없습니다.")
    private String address;


    public Member toEntity(){ // Member 생성자를 통해 객체 생성
        return Member.builder()
        .name(name)
        .email(email)
        .password(password)
        .age(age)
        .mobile(mobile)
        .address(address)
        .build();
    }  
}   

