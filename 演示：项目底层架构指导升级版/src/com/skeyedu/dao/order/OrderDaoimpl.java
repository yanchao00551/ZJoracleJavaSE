package com.skeyedu.dao.order;

import java.sql.Connection;
import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "order")
public class OrderDaoImpl extends CrezyManDao {
	public OrderDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
}
