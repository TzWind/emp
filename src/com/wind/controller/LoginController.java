package com.wind.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LoginController {
	
	@RequestMapping("index")
	public String index(String name) {
		
		return "index";
	}
	
	
	@RequestMapping("login")
	public String login(String name) {
		
		return "login";
	}
	
	
	@RequestMapping("article-list")
	public String articlel(String name) {
		
		return "article-list";
	}
	
	
	

}
