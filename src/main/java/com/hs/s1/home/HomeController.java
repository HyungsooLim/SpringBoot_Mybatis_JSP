package com.hs.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ===================================
 * 				JSP Project
 * ===================================
 */

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) throws Exception {
		model.addAttribute("message", "JSP Project");
		
		model.addAttribute("user", "HS");
		model.addAttribute("msg", "LOL");
		
		return "index";
	}
}
