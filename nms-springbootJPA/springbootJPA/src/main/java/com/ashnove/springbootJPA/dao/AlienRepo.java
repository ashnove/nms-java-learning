package com.ashnove.springbootJPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashnove.springbootJPA.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
	
}
