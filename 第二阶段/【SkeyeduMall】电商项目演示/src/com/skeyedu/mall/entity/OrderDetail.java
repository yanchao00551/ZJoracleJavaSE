package com.skeyedu.mall.entity;

import java.io.Serializable;

public class OrderDetail implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;  //ID
	private Integer orderId;   //订单ID
	private Integer quantity;   //数量
	private Float cost;   //单价
	private Integer productId;   //产品ID
	
	
	private Product product;    //商品


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Float getCost() {
		return cost;
	}


	public void setCost(Float cost) {
		this.cost = cost;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
}
