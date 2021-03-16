package demo.dao;

import java.sql.Connection;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDAO;

@Table(name = "order")
public class OrderDAO extends CrezyManDAO{

	public OrderDAO(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}



}
