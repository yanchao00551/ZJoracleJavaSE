package com.skeyedu.dao.menu;

import java.sql.Connection;
import com.skeyedu.annotation.Table;
import com.skeyedu.dao.TemplateDaoImpl;

@Table(name = "menu")
public class MenuDaoImpl extends TemplateDaoImpl{
	public MenuDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
}
