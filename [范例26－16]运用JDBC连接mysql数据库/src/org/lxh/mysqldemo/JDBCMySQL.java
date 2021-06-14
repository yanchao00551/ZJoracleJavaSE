package org.lxh.mysqldemo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCMySQL {
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://127.0.0.1:3306/jdbc?useSSL=false&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
	public static final String DBUSER = "root";
	public static final String DBPASS = "root";
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();
		
		result = stmt.executeQuery("SELECT pid,name,age,birthday,salary FROM person");
		while(result.next()) {
			int pid = result.getInt("pid");
			String name = result.getString("name");
			int age = result.getInt("age");
			Date birthday = result.getDate("birthday");
			float salary = result.getFloat("salary");
			System.out.println("pid =" + pid +";");
			System.out.println("name =" + name +";");
			System.out.println("age =" + age +";");
			System.out.println("birthday ="+birthday +";");
			System.out.println("salary =" + salary + ";");
		}
		
		//4.¹Ø±ÕÊý¾Ý¿â
		result.close();
		stmt.close();
		conn.close();
	}
}
