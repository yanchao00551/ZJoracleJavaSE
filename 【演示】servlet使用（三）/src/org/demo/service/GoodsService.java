package org.demo.service;

import java.util.List;

import org.demo.dao.GoodsDao;
import org.demo.entity.Product;

public class GoodsService {
	public  List<Product> queryAllProducts(){
		List<Product> list = GoodsDao.getAllProducts();
		return list;
	}
}
