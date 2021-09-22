package com.ashnove.WebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")  //accepting a home request
	public ModelAndView home(@RequestParam("name") String myName) { // accepting name
		
		ModelAndView mv = new ModelAndView(); // class that holds model and view
		mv.addObject("name", myName); // data or model
		mv.setViewName("home"); // view name
		return mv;
	}
}
//9.0.52