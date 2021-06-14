package demo.dao;

import java.sql.Connection;

import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "person")
public class PersonDao extends CrezyManDao{

	public PersonDao(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}



}
