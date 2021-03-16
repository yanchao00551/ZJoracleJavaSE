package org.demo.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	

	private String name;
	private String password;
	private List<String> habits;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getHabits() {
		return habits;
	}
	public void setHabits(List<String> habits) {
		this.habits = habits;
	}
	
	
	
}
