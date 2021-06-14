package com.skeyedu.mall.utils;

import java.io.Serializable;


/**
 *     通用分页类
 * @author 10947
 *
 */
public class Pager implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int currentPage;   //当前页
	private int rowCount;      //总条数
	private int rowPerPage;     //每页显示条数
	private int pageCount;        //总页数
	
	private String url;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getRowPerPage() {
		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public Pager(int rowCount,int rowPerPage,int currentPage) {
		this.rowCount = rowCount;  //总条数
		this.rowPerPage = rowPerPage;   //每页条数
		this.currentPage = currentPage;  //当前页
		
		if(this.rowCount % this.rowPerPage == 0) {
			this.pageCount = this.rowCount / this.rowPerPage;
		}else if(this.rowCount % this.rowPerPage > 0) {
			this.pageCount = this.rowCount / this.rowPerPage + 1;
		}else {
			this.pageCount = 0;
		}
		
	}
	
}
