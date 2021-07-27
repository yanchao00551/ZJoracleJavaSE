package com.demo.entity;

import java.io.Serializable;


/**
 * 对应数据库的用户表的实体类
 * @author 10947
 *
 */
public class User implements Serializable, Comparable<User> {
	
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String name;
	private Integer age;
	
	
	/**
	 * 排序方式
	 */
	private Integer type;
	
	
	
	
	
	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Integer getAge() {
		return age;
	}





	public void setAge(Integer age) {
		this.age = age;
	}





	public User(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public User() {
	}

	
	
	




	public Integer getType() {
		return type;
	}


	public void setType(Integer type) {
		this.type = type;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


	
	

	@Override
	public int compareTo(User o) {
		
		//TODO:升序
		if(o.getType() == 1) {
			if(this.age > o.getAge()) {
				return 1;
			}else if(this.age < o.getAge()) {
				return -1;
			}else {
				return 0;
			}
		}
		
		
		//TODO:降序
		if(o.getType() == 2) {
			if(this.age < o.getAge()) {
				return 1;
			}else if(this.age > o.getAge()) {
				return -1;
			}else {
				return 0;
			}
		}
		
		
		// TODO Auto-generated method stub
		return 0;
	}

}
