package com.skeyedu.mall.dao.product;

import java.util.List;

import com.skeyedu.mall.entity.Product;
import com.skeyedu.mall.param.ProductParams;

public interface ProductDao {
	
	void updateStock(Integer id, Integer quantity) throws Exception;

	int queryProductCount(ProductParams params) throws Exception;

	List<Product> queryProductList(ProductParams params) throws Exception;

	void deleteById(Integer id) throws Exception;

	Product getProductById(int parseInt) throws Exception;

	void save(Product product);

	void update(Product product);

}
