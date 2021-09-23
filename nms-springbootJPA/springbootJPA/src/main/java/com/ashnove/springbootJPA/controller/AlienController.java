package com.ashnove.springbootJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping("/alien/{FID}")
	@ResponseBody
	public String getAlien(@PathVariable("FID") int FID) {
		
		return repo.findById(FID).toString();
	}
	
}