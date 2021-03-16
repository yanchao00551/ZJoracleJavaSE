package org.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.demo.entity.Product;

public class GoodsDao {
	public static List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("联想笔记本","北京",4399));
		products.add(new Product("联想商用电脑","北京",8399));
		products.add(new Product("惠普打印机","不详",1399));
		return products;
	}
}
