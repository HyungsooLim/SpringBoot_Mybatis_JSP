package com.hs.s1.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

// 로그인 실패 했을 때 실행하는 객체
@Component
public class LoginFail implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		System.out.println("===== Login Fail Handler =====");
		System.out.println(exception.getClass());
		
		String errorClass = exception.getClass().toString().substring(exception.getClass().toString().lastIndexOf(".")+1);
		System.out.println(errorClass);
		
		String message="";
		
		switch(errorClass) {
		case "InternalAuthenticationServiceException" :
			message = "ID가 존재하지 않음";
			break;
		case "BadCredentialsException" :
			message = "PW가 일치하지 않음";
			break;
		case "AuthenticationCredentialsNotFoundException" :
			message = "인증 실패";
			break;
		case "LockedException" :
			message = "계정 잠김 -> isAccountNonLocked() 확인";
			break;
		case "DisabledException" :
			message = "휴면계정";
			break;
		case "AccountExpiredException" :
			message = "계정 유효기간 만료";
			break;
		case "CredentialExpiredException" :
			message = "PW 유효기간 만료";
			break;
		default :
			message = "다시 시도";
		}
		
		request.setAttribute("message", message);
		request.getRequestDispatcher("/member/memberLogin?error").forward(request, response);
		
	}

	
}
