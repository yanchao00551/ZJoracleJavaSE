package com.skeyedu.dao.publisher;

import java.sql.Connection;
import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "publisher")
public class PublisherDaoImpl extends CrezyManDao {
	public PublisherDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
}
