package com.demo.vo;

import com.demo.entity.User;

public class UserVO {
	private User user;
	
	public UserVO() {
		this.user = new User();
	}
	
	public UserVO(User user) {
		this.user = user;
	}

	public Long getId() {
		return user.getId();
	}

	public void setId(Long id) {
		user.setId(id);
	}

	public String getName() {
		return user.getName();
	}

	public void setName(String name) {
		user.setName(name);
	}

	public Integer getAge() {
		return user.getAge();
	}

	public void setAge(Integer age) {
		user.setAge(age);
	}

	public Integer getType() {
		return user.getType();
	}

	public void setType(Integer type) {
		user.setType(type);
	}

	
	
}
