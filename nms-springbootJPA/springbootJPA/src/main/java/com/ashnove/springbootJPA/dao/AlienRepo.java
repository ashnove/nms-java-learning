package com.ashnove.springbootJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ashnove.springbootJPA.model.Alien;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer>{
	
	List<Alien> findByType(String Type);

	@Query("FROM Alien WHERE type=?1 ORDER BY Name")
	List<Alien> findByTypeSorted(String type);
	
	
}
