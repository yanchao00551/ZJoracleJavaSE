package com.skeyedu.dao;

import java.util.List;

import com.skeyedu.entity.order.OrderEntity;
import com.skeyedu.utils.Params;

public interface ModelDao extends IBaseDao{
	
	public int save(Object entity) throws Exception;
	
	public void update(Params params,Object obj) throws Exception;
	
	public void deleteById(Integer id) throws Exception;
	
	public Object getEntityById(Integer id) throws Exception;
	
	public List<Object> queryEntityList(Params params) throws Exception;
	
	public Integer queryOrderCount(Params params) throws Exception;
}
