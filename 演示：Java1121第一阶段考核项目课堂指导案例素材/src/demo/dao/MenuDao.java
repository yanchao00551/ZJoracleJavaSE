package demo.dao;

import java.sql.Connection;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDAO;

@Table(name = "menu")
public class MenuDAO extends CrezyManDAO{

	public MenuDAO(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}



}
