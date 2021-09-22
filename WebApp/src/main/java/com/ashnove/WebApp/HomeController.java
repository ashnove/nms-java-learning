package com.ashnove.WebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(@RequestParam("name") String myName, HttpSession session) {
		
		System.out.println("Hi" + myName);
		session.setAttribute("name", myName);
		return "home";
	}
}
//9.0.52