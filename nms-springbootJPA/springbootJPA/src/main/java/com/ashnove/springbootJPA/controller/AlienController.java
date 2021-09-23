package com.ashnove.springbootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashnove.springbootJPA.dao.AlienRepo;
import com.ashnove.springbootJPA.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo; 
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Reload!");
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int PID) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(PID).orElse(new Alien());
		
		System.out.println(repo.findByType("1"));
		
		System.out.println(repo.findByTypeSorted("1"));
		
		mv.addObject(alien);
		return mv;
	}
	
}