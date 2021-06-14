package com.skeyedu.mall.dao.order;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.OrderDetail;
import com.skeyedu.mall.param.OrderDetailParam;

public interface OrderDetailDao extends IBaseDao {

    public void saveOrderDetail(OrderDetail detail,int orderId) throws Exception;

	public void deleteById(OrderDetail detail) throws Exception;
	
	public OrderDetail getOrderDetailById(Integer id)throws Exception; 
	
	public List<OrderDetail> queryOrderDetailList(OrderDetailParam params)throws Exception; 
	
	public Integer queryOrderDetailCount(OrderDetailParam params)throws Exception; 
}
