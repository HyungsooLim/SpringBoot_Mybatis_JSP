package com.hs.s1.member;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	
	@GetMapping("join")
	public void setJoin(Model model) throws Exception {
		model.addAttribute("memberVO", new MemberVO());
	}
	
	@PostMapping("join")
	public String setJoin(@Valid MemberVO memberVO, BindingResult bindingResult) throws Exception {
		// BindingResult는 @Valid 하는 클래스 바로 뒤에 와야함
		// BindingResult에 에러가 들어감
		
		if(bindingResult.hasErrors()) {
			return "member/join";
		}
		
		return "redirect:/";
	}
}
