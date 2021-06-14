package com.skeyedu.dao.student;

import java.sql.Connection;
import com.crezyman.annotation.Table;
import com.crezyman.dao.CrezyManDao;

@Table(name = "tb_student")
public class StudentDaoImpl extends CrezyManDao {
	public StudentDaoImpl(Connection connection) throws Exception {
		super(connection);
		// TODO Auto-generated constructor stub
	}
	
	
}
