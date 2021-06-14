package demo.dao;

import java.sql.Connection;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "menu")
public class MenuDao extends CrezyManDao{

	public MenuDao(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}



}
