package com.skeyedu.mall.utils;

import java.io.Serializable;

import com.skeyedu.mall.entity.Product;

public class ShoppingCartItem implements Serializable {


	private static final long serialVersionUID = 1L;

	
	private Product product;//商品
	private Integer quantity;//数量
	private float cost;//价格  ,这里的总价是单件商品的总价，而不是整个购物车的总价（小计)

	public ShoppingCartItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
		this.cost = product.getPrice() * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		this.cost = product.getPrice() * quantity;
	}

	public Product getProduct() {
		return product;
	}

	public float getCost() {
		return cost;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
