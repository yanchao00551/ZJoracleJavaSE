package com.skeyedu.mall.dao.product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.skeyedu.mall.dao.BaseDaoImpl;
import com.skeyedu.mall.entity.ProductCategory;
import com.skeyedu.mall.param.ProductCategoryParams;
import com.skeyedu.mall.utils.EmptyUtils;

public class ProductCategoryDaoImpl extends BaseDaoImpl implements ProductCategoryDao {

	public ProductCategoryDaoImpl(Connection connection) {
		// TODO Auto-generated constructor stub
		super(connection);
	}

	@Override
	public ProductCategory queryProductCategoryById(Integer id) {
		// TODO Auto-generated method stub
		ProductCategory productCategory = null;
		String sql = "select id,name,parentId,type,iconClass from skeyedu_product_category where id = ?";
		ResultSet resultSet = this.executeQuery(sql.toString(), new Object[] {id});
		try {
			while(resultSet.next()) {
				productCategory = (ProductCategory) this.tableToClass(resultSet);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource();
			this.closeResource(resultSet);
		}
		return productCategory;
	}

	@Override
	public List<ProductCategory> queryProductCategoryList(ProductCategoryParams param) {
		// TODO Auto-generated method stub
		List<Object> paramsList = new ArrayList<Object>();
		List<ProductCategory> productList = new ArrayList<ProductCategory>();
		StringBuffer sql = new StringBuffer("select id,name,parentId,type,iconClass from skeyedu_product_category where 1=1 ");
		ResultSet resultSet = null;
		try {
			if(EmptyUtils.isNotEmpty(param.getName())) {
				sql.append(" and name like ?");
				paramsList.add("%" + param.getName() + "%");
			}
			if(EmptyUtils.isNotEmpty(param.getParentId())) {
				sql.append(" and parentId = ?");
				paramsList.add(param.getParentId());
			}
			if(EmptyUtils.isNotEmpty(param.getType())) {
				sql.append(" and type = ?");
				paramsList.add(param.getType());
			}
			if(param.isPage()) {
				sql.append(" limit " + param.getStartIndex() + "," + param.getPageSize());
			}
			resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
			while(resultSet.next()) {
				ProductCategory productCategory = (ProductCategory) this.tableToClass(resultSet);
				productList.add(productCategory);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public Integer queryProductCategoryCount(ProductCategoryParams param) {
		// TODO Auto-generated method stub
		List<Object> paramsList = new ArrayList<Object>();
		Integer count = 0;
		StringBuffer sql = new StringBuffer("select count(1) count from skeyedu_product_categroy where 1=1 ");
		ResultSet resultSet = null;
		try {
			if(EmptyUtils.isNotEmpty(param.getName())) {
				sql.append(" and name like ?");
				paramsList.add("%" + param.getName() + "%");
			}
			if(EmptyUtils.isNotEmpty(param.getParentId())) {
				sql.append(" and parentId = ?");
				paramsList.add(param.getParentId());
			}
			
			resultSet = this.executeQuery(sql.toString(), paramsList.toArray());
			while(resultSet.next()) {
				count = resultSet.getInt("count");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void update(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		try {
			Object[] params = new Object[]{productCategory.getName(),productCategory.getParentId(),productCategory.getType(),productCategory.getIconClass(),productCategory.getId()};
			String sql = "update skeyedu_product_category set name=?,parentId=?,type=?,iconClass=? where id = ?";
			this.excuteUpdate(sql, params);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource();
		}
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		String sql = "delete from skeyedu_product_category where id = ?";
		Object[] params = new Object[] {id};
		this.excuteUpdate(sql.toString(), params);
	}

	@Override
	public Integer save(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		Integer id = 0;
		try {
			String sql = "insert into skeyedu_product_category(name,parentKId,type,iconClass) values(?,?,?,?)";
			Object[] param = new Object[] {productCategory.getName(),productCategory.getParentId(),productCategory.getType(),productCategory.getIconClass()};
			id = this.executeInsert(sql, param);
			productCategory.setId(id); //这里是将传递进来的引用，设置值并返给Service层，Service可以直接使用传进来的引用对象调用getId()即可取到主键值
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeResource();
		}
		return id;		
	}
	

	@Override
	public Object tableToClass(ResultSet rs) throws Exception {
		// TODO Auto-generated method stub
		ProductCategory productCategory = new ProductCategory();
		productCategory.setId(rs.getInt("id"));
		productCategory.setName(rs.getString("name"));
		productCategory.setParentId(rs.getInt("parentId"));
		productCategory.setType(rs.getInt("type"));
		productCategory.setIconClass(rs.getString("iconClass"));
		return productCategory;
	}

}
