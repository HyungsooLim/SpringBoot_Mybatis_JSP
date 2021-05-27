package com.hs.s1.member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class MemberVO implements UserDetails {
	
	private String username;
	
	// 최소 4글자 이상 통과
	@Length(max = 10, min = 4)
	private String password;
	
	private String passwordCheck;
	
	@NotEmpty(message = "이름 좀 써라")
	private String name;
	@Email
	@NotEmpty
	private String email;
	private String phone;
	
	// 0 이상 200이하
	@Range(min = 0, max = 200)
	private Integer age;
	
	// Security
	private boolean enabled;
	
	private List<RoleVO> roles;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// Collection의 자식인 ArrayList로 변환
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		// roleVO에 담겨있는 roleName들을 authorities에 담아
		for(RoleVO roleVO:this.roles) {
			authorities.add(new SimpleGrantedAuthority(roleVO.getRoleName()));
		}
		
		return authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
