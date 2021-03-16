package com.skeyedu.mall.param;

import com.skeyedu.mall.entity.ProductCategory;

public class ProductCategoryParams extends ProductCategory{
	
	private static final long serialVersionUID = 1L;
	
	private Integer startIndex;        //SQL LIMIT 起始位置  用于分页
	private Integer pageSize; 	       //SQL LIMIT 结束位置  用户分页
	
	private String sort;                //排序
	
	
	private boolean isPage = false;   //默认不开启分页


	public Integer getStartIndex() {
		return startIndex;
	}


	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}


	public Integer getPageSize() {
		return pageSize;
	}


	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}


	public String getSort() {
		return sort;
	}


	public void setSort(String sort) {
		this.sort = sort;
	}


	public boolean isPage() {
		return isPage;
	}


	public void setPage(boolean isPage) {
		this.isPage = isPage;
	}
	
	
	public void openPage(Integer startIndex,Integer pageSize) {
		this.isPage = true;
		this.startIndex = startIndex;
		this.pageSize = pageSize;
	}
	
	
}
