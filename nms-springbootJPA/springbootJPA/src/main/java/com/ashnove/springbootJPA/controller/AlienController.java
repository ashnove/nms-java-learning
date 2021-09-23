package com.ashnove.springbootJPA.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ashnove.springbootJPA.dao.AlienRepo;
import com.ashnove.springbootJPA.model.Alien;

import java.util.List;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo; 
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Reload!");
		return "home.jsp";
	}
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
	@GetMapping(path = "/aliens", consumes = {"application/json"})
	public List<Alien> getAlien() {
		
		return repo.findAll();
			
	}
	
	@RequestMapping("/alien/{FID}")
	public Optional<Alien> getAlien(@PathVariable("FID") int FID) {
		
		return repo.findById(FID);
		 
	}
	

	@PutMapping("/File")
	public Alien updateFile(@RequestBody Alien alien) {

		repo.save(alien);
		return alien;
	}

	@DeleteMapping("/alien/{fid}")
	public String deleteFile(@PathVariable int fid) {

		Alien alien = repo.getOne(fid);
		repo.delete(alien);
		return "Object Deleted";
	}
	
	
}