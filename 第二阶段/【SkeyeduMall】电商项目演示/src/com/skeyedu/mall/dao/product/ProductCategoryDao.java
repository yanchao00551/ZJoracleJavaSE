package com.skeyedu.mall.dao.product;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.ProductCategory;
import com.skeyedu.mall.param.ProductCategoryParams;

public interface ProductCategoryDao extends IBaseDao {

	ProductCategory queryProductCategoryById(Integer id);

	List<ProductCategory> queryProductCategoryList(ProductCategoryParams param);

	Integer queryProductCategoryCount(ProductCategoryParams param);

	void update(ProductCategory productCategory);

	void deleteById(Integer id);

	Integer save(ProductCategory productCategory);

}
