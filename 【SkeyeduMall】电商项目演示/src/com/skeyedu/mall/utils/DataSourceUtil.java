package com.skeyedu.mall.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 获取JDBC的Connection接口并连接、关闭连接的封装JavaBean
 * @author 10947
 *
 */
public class DataSourceUtil {
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	
	
	static {
		init();
	}
	
	public static void init() {
		Properties params = new Properties();
		String configFile = "database.properties";
		InputStream is = DataSourceUtil.class.getClassLoader().getResourceAsStream(configFile);
		try {
			params.load(is);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		driver = params.getProperty("driver");
		url = params.getProperty("url");
		user = params.getProperty("username");
		password = params.getProperty("password");
	}
	
	
	//获取连接
	public static Connection openConnection() throws SQLException{
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	
	//关闭连接
	public static void closeConnection(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
