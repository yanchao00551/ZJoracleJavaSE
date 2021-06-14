package org.demo.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	

	private String name;
	private String password;
	private Integer status;
	private String msg;
	
	private List<String> habits;
	
	private List<Pictrue> picture;
	
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
	
	
	
	
	public List<Pictrue> getPicture() {
		return picture;
	}
	public void setPicture(List<Pictrue> picture) {
		this.picture = picture;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", status=" + status + ", msg=" + msg + ", habits="
				+ habits + ", picture=" + picture + "]";
	}

	
	
	
	
	
}



  