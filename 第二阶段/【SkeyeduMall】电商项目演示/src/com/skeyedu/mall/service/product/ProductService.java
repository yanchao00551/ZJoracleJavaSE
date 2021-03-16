package com.skeyedu.mall.service.product;

import java.util.List;

import com.skeyedu.mall.entity.Product;
import com.skeyedu.mall.param.ProductParams;
import com.skeyedu.mall.utils.Pager;

public interface ProductService {
	/**
	 * 根据分类查询商品列表
	 * @param categoryId  传进来的分类ID
	 * @param level       层级
	 * @param pager
	 * @return
	 */
	public List<Product> getProductsByCategory(Integer categoryId, int level, Pager pager,String keyWord);
	/**
	 * 根据分类查询商品数目
	 * @param categoryId
	 * @param level
	 * @return
	 */
	int getProductRowCount(String categoryId,int level,String keyWord);
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	Product findById(String id);//根据ID查询商品
	/**
	 * 保存商品返回id
	 * @param product
	 * @return
	 */
	Integer saveOrUpdate(Product product);//保存一款商品
	/**
	 * 查询商品数目
	 * @param params
	 * @return
	 */
	 public int getProductRowCount(ProductParams params);
	/**
	 * 查询商品列表
	 * @param params
	 * @return
	 */
	List<Product> queryProductsList(ProductParams params);
	/**
	 * 根据id删除商品
	 * @param id
	 */
	public void deleteById(Integer id);
	/**
	 * 根据分类id查询数目
	 * @param categoryId
	 * @return
	 */
	public int getProductCountBycategory(Integer categoryId);
}
