package com.demo.entity;

import java.io.Serializable;

/*
 * 菜品实体类
 */
public class Menu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Double price;
	private Integer zan;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getZan() {
		return zan;
	}
	public void setZan(Integer zan) {
		this.zan = zan;
	}
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", price=" + price + ", zan=" + zan + "]";
	}
}