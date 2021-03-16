package com.skeyedu.mall.service.order.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.skeyedu.mall.dao.order.OrderDao;
import com.skeyedu.mall.dao.order.OrderDaoImpl;
import com.skeyedu.mall.dao.order.OrderDetailDao;
import com.skeyedu.mall.dao.order.OrderDetailDaoImpl;
import com.skeyedu.mall.dao.product.ProductDao;
import com.skeyedu.mall.dao.product.ProductDaoImpl;
import com.skeyedu.mall.entity.Order;
import com.skeyedu.mall.entity.OrderDetail;
import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.param.OrderDetailParam;
import com.skeyedu.mall.param.OrderParams;
import com.skeyedu.mall.service.order.OrderService;
import com.skeyedu.mall.utils.DataSourceUtil;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.utils.ShoppingCart;
import com.skeyedu.mall.utils.ShoppingCartItem;
import com.skeyedu.mall.utils.StringUtils;

public class OrderServiceImpl implements OrderService {

	/**
	 * 结算购物车物品 1.生成订单 2.生成订单明细(拆单) 3.减库存 注意加入事物的控制
	 */
	public Order payShoppingCart(ShoppingCart cart, User user, String address) {// 购物
		Connection connection = null;
		Order order = new Order();
		try {
			connection = DataSourceUtil.openConnection();
			OrderDao orderDao = new OrderDaoImpl(connection);
			OrderDetailDao orderDetailDao = new OrderDetailDaoImpl(connection);
			ProductDao productDao = new ProductDaoImpl(connection);
			// 开启事物控制，整体提交
			connection.setAutoCommit(false);
			// 更新订单 (新增)
			order.setUserId(user.getId());
			order.setUserAddress(address);
			order.setCreateTime(new Date());
			order.setCost(cart.getTotalCost());
			order.setSerialNumber(StringUtils.randomUUID());
			order.setLoginName(user.getLoginName());
			orderDao.saveOrder(order);
			for (ShoppingCartItem item : cart.getItems()) {
				// 更新订单详情
				OrderDetail detail = new OrderDetail();
				detail.setOrderId(order.getId());
				detail.setCost(item.getCost());
				detail.setProduct(item.getProduct());
				detail.setQuantity(item.getQuantity());
				orderDetailDao.saveOrderDetail(detail, order.getId());
				productDao.updateStock(item.getProduct().getId(),item.getQuantity());
			}
			connection.commit();
		} catch (SQLException e) {
			connection.rollback();
			order = null;
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
			return order;
		}
	}

	public Order findById(String id) {// 根据ID获取订单
		Connection connection = null;
		Order order = null;
		try {
			connection = DataSourceUtil.openConnection();
			OrderDao orderDao = new OrderDaoImpl(connection);
			order = (Order) orderDao.getOrderById(Integer.valueOf(id));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return order;
	}

	public int getOrderRowCount(OrderParams params) {// 获取订单记录条数
		Connection connection = null;
		int rtn = 0;
		try {
			connection = DataSourceUtil.openConnection();
			OrderDao orderDao = new OrderDaoImpl(connection);
			rtn = orderDao.queryOrderCount(params);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return rtn;
	}

	@Override
	public List<OrderDetail> queryOrderDetailList(OrderDetailParam param) {
		Connection connection = null;
		List<OrderDetail> rtn = null;
		try {
			connection = DataSourceUtil.openConnection();
			OrderDetailDao orderDetailDao = new OrderDetailDaoImpl(connection);
			rtn = orderDetailDao.queryOrderDetailList(param);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return rtn;
	}

	/**
	 * 查询订单列表
	 * 
	 * @param userId
	 * @param pager
	 * @return
	 */
	@Override
	public List<Order> queryOrderList(Integer userId, Pager pager) {
		Connection connection = null;
		List<Order> orderList = null;
		try {
			connection = DataSourceUtil.openConnection();
			OrderDao orderDao = new OrderDaoImpl(connection);
			OrderParams params = new OrderParams();
			params.setUserId(userId);
			params.setStartIndex((pager.getCurrentPage() - 1) * pager.getRowPerPage());
			params.setPageSize(pager.getRowPerPage());
			params.setSort(" createTime desc ");
			orderList = orderDao.queryOrderList(params);
			for (int i = 0; i < orderList.size(); i++) {
				Order order = orderList.get(i);
				OrderDetailParam orderDetailParam=new OrderDetailParam();
				orderDetailParam.setOrderId(order.getId());
				order.setOrderDetailList(queryOrderDetailList(orderDetailParam));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return orderList;
	}

	public List<Order> queryOrderList(Pager pager) {
		Connection connection = null;
		List<Order> orderList = null;
		try {
			connection = DataSourceUtil.openConnection();
			OrderDao orderDao = new OrderDaoImpl(connection);
			OrderParams params = new OrderParams();
			params.openPage((pager.getCurrentPage() - 1) * pager.getRowPerPage(), pager.getRowPerPage());
			orderList=orderDao.queryOrderList(params);
			for (int i = 0; i < orderList.size(); i++) {
				Order order = orderList.get(i);
				OrderDetailParam orderDetailParam=new OrderDetailParam();
				orderDetailParam.setOrderId(order.getId());
				order.setOrderDetailList(queryOrderDetailList(orderDetailParam));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DataSourceUtil.closeConnection(connection);
		}
		return orderList;
	}

}
