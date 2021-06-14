package com.skeyedu.service;

import java.util.List;

import com.skeyedu.utils.Params;

public interface IBaseService<T> {
	
	public void delete(String id) ;
	
	public T findById(String id);
	
	public int save(Object Entity) ;
	
	public void update(Params params,Object entity) ;
	
	public List<Object> queryOrdersList(Params params) ;
	
	public Integer queryCount(Params param) ;

}
