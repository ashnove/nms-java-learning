package com.ashnove.springbootJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Alien {
	
	@Id
	private int FID;
	private String PID;
	private String type;
	private String Name;
	private String ParentID;
	private String Description;
	
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getParentID() {
		return ParentID;
	}
	public void setParentID(String parentID) {
		ParentID = parentID;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		System.out.println("des=" + description);
		Description = description;
	}
	@Override
	public String toString() {
		return "Alien [FID=" + FID + ", PID=" + PID + ", type=" + type + ", Name=" + Name + ", ParentID=" + ParentID
				+ ", Description=" + Description + "]";
	}
	
	
	
	
	
}
