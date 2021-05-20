package com.hs.s1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	private String password;
	@NotEmpty
	private String name;
	@Email
	private String email;
	private String phone;

}
