package com.ashnove.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	private String lastNamep;
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastNamep, String emailId) {
		super();
		this.firstName = firstName;
		this.lastNamep = lastNamep;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNamep() {
		return lastNamep;
	}
	public void setLastNamep(String lastNamep) {
		this.lastNamep = lastNamep;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
}
