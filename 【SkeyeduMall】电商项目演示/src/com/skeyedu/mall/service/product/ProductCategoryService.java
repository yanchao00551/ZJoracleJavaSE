package com.skeyedu.mall.service.product;

import java.util.List;

import com.skeyedu.mall.entity.ProductCategory;
import com.skeyedu.mall.param.ProductCategoryParams;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.utils.ProductCategoryVo;

public interface ProductCategoryService {
	/**
	 * 添加商品分类
	 * @param ProductCategory
	 */
	void addProductCategory(ProductCategory ProductCategory);   //保存
	
	
	/**
	 *   根 据id查询
	 * @param parameter
	 * @return
	 */
	ProductCategory getById(Integer id);
	
	
	/**
	  * 查询全部的商品分类
	 * @param pager
	 * @return
	 */
	public List<ProductCategoryVo> queryAllProductCategoryList();
	
	
	/**
	 * 根据id删除
	 * @param parameter
	 */
	void deleteById(Integer id);
	
	
	/**
	 * 根据sql查询商品分类列表
	 * @param param
	 * @return
	 */
	List<ProductCategory> queryProductCategorylistBySql(ProductCategoryParams param);
	
	
	/**
   	   * 查询数目
	 * @param param
	 * @return
	 */
	Integer queryProductCategoryCount(ProductCategoryParams param);
	
	
	/**
	 * 修改商品分类
	 * @param ProductCategory
	 */
	void modifyProductCategory(ProductCategory ProductCategory);
}
