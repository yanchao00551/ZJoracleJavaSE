package com.skeyedu.dao.order;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.skeyedu.annotation.Table;
import com.skeyedu.dao.AbstractBaseDaoImpl;
import com.skeyedu.dao.ModelDao;
import com.skeyedu.dao.TemplateDaoImpl;
import com.skeyedu.utils.Params;
import com.skeyedu.utils.StringUtils;

@Table(name = "order")
public class OrderDaoImpl extends TemplateDaoImpl {
	public OrderDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
}
