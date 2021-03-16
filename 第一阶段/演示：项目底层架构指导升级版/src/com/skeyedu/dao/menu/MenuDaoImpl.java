package com.skeyedu.dao.menu;

import java.sql.Connection;
import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "menu")
public class MenuDaoImpl extends CrezyManDao{
	public MenuDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
}
