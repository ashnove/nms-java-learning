package com.ashnove.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashnove.backend.model.Employee;
import com.ashnove.backend.repository.EmployeeRepository;
																																																															
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*") 
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	
	
}