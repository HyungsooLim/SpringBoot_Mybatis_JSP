package com.hs.s1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	
	// 최소 4글자 이상 통과
	@Size(min = 4, message = "4 ~ 20 ")
	private String password;
	@NotEmpty(message = "이름 좀 써라")
	private String name;
	@Email
	private String email;
	private String phone;
	
	// 0 이상 200이하
	@Range(min = 0, max = 200)
	private Integer age;

}
