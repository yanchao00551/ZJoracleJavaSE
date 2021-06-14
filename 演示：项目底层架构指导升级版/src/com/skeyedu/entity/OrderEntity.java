package com.skeyedu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.crezyman.annotation.NotField;
import com.crezyman.annotation.Table;

/**
 * 订单实体类
 * @author 10947
 *
 */
@Table(name = "order")
public class OrderEntity implements Serializable{
	

	@NotField
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String name;
	private String dishMegs;
	private String times;
	private String address;
	private Integer states;
	private BigDecimal sumPrice;
	
	
	/*
	 * 菜单集合
	 */
	@NotField
	private List<MenuEntity> menuList;
	
	
	
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




	public String getDishMegs() {
		return dishMegs;
	}




	public void setDishMegs(String dishMegs) {
		this.dishMegs = dishMegs;
	}




	public String getTimes() {
		return times;
	}




	public void setTimes(String times) {
		this.times = times;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public Integer getStates() {
		return states;
	}




	public void setStates(Integer states) {
		this.states = states;
	}




	public BigDecimal getSumPrice() {
		return sumPrice;
	}




	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}



	public OrderEntity() {
		
	}
	

	public OrderEntity(Integer id, String name, String dishMegs, String times, String address, Integer states,
			BigDecimal sumPrice) {
		this.id = id;
		this.name = name;
		this.dishMegs = dishMegs;
		this.times = times;
		this.address = address;
		this.states = states;
		this.sumPrice = sumPrice;
	}




	@Override
	public String toString() {
		return "OrderEntity [id=" + id + ", name=" + name + ", dishMegs=" + dishMegs + ", times=" + times + ", address="
				+ address + ", states=" + states + ", sumPrice=" + sumPrice + "]";
	}
	
	
	



}
