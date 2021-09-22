package com.ashnove.springbootJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private int FID;
	private String PID;
	private String Type;
	private String Name;
	private String ParentID;
	private String Description;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
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
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
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
		Description = description;
	}
	@Override
	public String toString() {
		return "Alien [FID=" + FID + ", PID=" + PID + ", Type=" + Type + ", Name=" + Name + ", ParentID=" + ParentID
				+ ", Description=" + Description + "]";
	}
	
	
	
	
	
}
