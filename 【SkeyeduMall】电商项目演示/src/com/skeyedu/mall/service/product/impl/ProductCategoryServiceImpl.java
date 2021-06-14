package com.skeyedu.mall.service.product.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.mall.dao.news.NewsDao;
import com.skeyedu.mall.dao.news.NewsDaoImpl;
import com.skeyedu.mall.dao.product.ProductCategoryDao;
import com.skeyedu.mall.dao.product.ProductCategoryDaoImpl;
import com.skeyedu.mall.entity.News;
import com.skeyedu.mall.entity.ProductCategory;
import com.skeyedu.mall.param.ProductCategoryParams;
import com.skeyedu.mall.service.product.ProductCategoryService;
import com.skeyedu.mall.utils.DataSourceUtil;
import com.skeyedu.mall.utils.EmptyUtils;
import com.skeyedu.mall.utils.ProductCategoryVo;

public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Override
	public void addProductCategory(ProductCategory ProductCategory) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			productCategoryDao.save(ProductCategory);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}

	@Override
	public ProductCategory getById(Integer id) {
		// TODO Auto-generated method stub
		ProductCategory productCategory = null;
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			productCategory = productCategoryDao.queryProductCategoryById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return productCategory;
	}

	@Override
	public List<ProductCategoryVo> queryAllProductCategoryList() {
		// TODO Auto-generated method stub
		//查询一级分类列表
		List<ProductCategoryVo> productCategroy1VoList = new ArrayList<ProductCategoryVo>();
		//查询一级分类  根据父ID查询所有子商品分类
		List<ProductCategory> productCategory1List =  getProductCategorys(0);
		//查询二级分类
		for(ProductCategory product1Category:productCategory1List) {
			//封装1级分类
			ProductCategoryVo productCategoryVo = new ProductCategoryVo();
			productCategoryVo.setProductCategory(product1Category);
			List<ProductCategoryVo> productCategoryVo1ChildList = new ArrayList<ProductCategoryVo>();
			//根据一级分类查询二级分类,只是当前循环1级分类里的二级分类，不是所有的二级分类
			List<ProductCategory> productCategory2List =  getProductCategorys(product1Category.getId());
			for(ProductCategory productCategory2:productCategory2List) {
				ProductCategoryVo ProductCategoryVo2 = new ProductCategoryVo();
				productCategoryVo1ChildList.add(ProductCategoryVo2);
				ProductCategoryVo2.setProductCategory(productCategory2);
				List<ProductCategoryVo> productCategoryVo2ChildList = new ArrayList<ProductCategoryVo>();
				ProductCategoryVo2.setProductCategoryVoList(productCategoryVo2ChildList);
				//根据二级分类查询三级分类的列表
				List<ProductCategory> productCategory3List = getProductCategorys(productCategory2.getId());
				for(ProductCategory productCategory3:productCategory3List) {
					ProductCategoryVo productCategoryVo3 = new ProductCategoryVo();
					productCategoryVo3.setProductCategory(productCategory3);
					productCategoryVo2ChildList.add(productCategoryVo3);
				}
			}
			productCategoryVo.setProductCategoryVoList(productCategoryVo1ChildList);
			productCategroy1VoList.add(productCategoryVo);
		}
		return productCategroy1VoList;
	}
	
	
	/**
	 * 查询子分类,
	 * 形参 parentId 根据父ID查询所有子商品分类
	 */
	private List<ProductCategory> getProductCategorys(Integer parentId){
		List<ProductCategory> rtn = new ArrayList<ProductCategory>();
			
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			ProductCategoryParams params = new ProductCategoryParams();
			if(EmptyUtils.isNotEmpty(parentId)) {
				params.setParentId(parentId);
			}else {
				params.setParentId(0);
			}
			rtn = productCategoryDao.queryProductCategoryList(params);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
			return rtn;
		}
	}
	
	
	

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			productCategoryDao.deleteById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}

	@Override
	public List<ProductCategory> queryProductCategorylistBySql(ProductCategoryParams param) {
		// TODO Auto-generated method stub
	    List<ProductCategory> rtn = new ArrayList<ProductCategory>();
		
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			rtn = productCategoryDao.queryProductCategoryList(param);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return rtn;
	}

	@Override
	public Integer queryProductCategoryCount(ProductCategoryParams param) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Integer count = 0;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			count = productCategoryDao.queryProductCategoryCount(param);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
		
		return count;
	}

	@Override
	public void modifyProductCategory(ProductCategory ProductCategory) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = DataSourceUtil.openConnection();
			ProductCategoryDao productCategoryDao = new ProductCategoryDaoImpl(connection);
			productCategoryDao.update(ProductCategory);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DataSourceUtil.closeConnection(connection);
		}
	}

}
