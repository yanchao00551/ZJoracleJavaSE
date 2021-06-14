package com.skeyedu.mall.param;

import com.skeyedu.mall.entity.News;

/**
 *    新闻分页增强类
 *   在param包下新增NewsParams.java分页增强类，继承了News.java实体类，从而可以实现查询新闻列表和查询数目功能
 * 
 * @author 10947
 *
 */
public class NewsParams extends News{

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
