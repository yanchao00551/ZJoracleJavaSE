package demo.dao;

import java.sql.Connection;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "order")
public class OrderDao extends CrezyManDao{

	public OrderDao(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}



}
