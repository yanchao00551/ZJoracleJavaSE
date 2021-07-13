package demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import demo.domain.Person;

/**
 * PrepararedStatement接口取代Statemtn接口
 * 增加内容 、修改内容
 * @author 10947
 *
 */
public class ConnectJDBC {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //表示数据库的连接的对象
		conn = DataSourceUtil.openConnection();
		
		//3、 写需要执行的SQL
		PreparedStatement pstmt = null;     //预处理对象  操作数据库  

		/*
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = input.next();
		System.out.println("请输入年龄：");
		int age = input.nextInt();
		System.out.println("请输入生日：");
		String date = input.next();
		System.out.println("请输入员工工资：");
		BigDecimal salary = input.nextBigDecimal();
		*/
		
		//1、写预编译SQL
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES (?,?,?,?)";  //预编译对象
		
		String sqlUpdate = "UPDATE `person` SET `name`= ?, `age`= ?,  `salary`= ? WHERE `pid`= ?" ;
		
		//预编译SQL
		String sqlSelect2 = "SELECT * FROM `person` LEFT JOIN  `book` ON `person`.like_bid = `book`.b_id WHERE 	1=1 "; //连表
		
		// 预编译SQL 而不是写死的
		String sqlSelect1 = "SELECT * FROM `person` WHERE 	1=1  ORDER BY `birthday` DESC LIMIT ?,?";  //单表
				
		List<Person> list = new ArrayList<>();
		
		// 2、PreparedStatement接口需要通过Connection接口进行实例化操作，同时传入预编译SQL
		pstmt = conn.prepareStatement(sqlSelect2);
		// 3、给预编译SQL  ？ 占位符 填 值 
		
		//单表
		//int currentPage = 3;   //当前页
		//int pageSize  = 2;    
		//int startIndex = (currentPage - 1) * pageSize;
		//pstmt.setInt(1, startIndex);   //第1个 ?  （参数占位符) 的内容  
		//pstmt.setInt(2, pageSize);
		
		//pstmt.setBigDecimal(3, salary);
		//pstmt.setInt(4, 6);
		
		//4、执行SQL语句，更新数据库
		//pstmt.executeUpdate();
		
		//ResultSet result = pstmt.executeQuery(sqlSelect2);       //有参的情况下调用的是  Statement接口
		ResultSet result = pstmt.executeQuery();   //而无参的情况下，调用的是 PreparedStatement 接口
		while(result.next()) {
			Person person = new Person();
			person.setName(result.getString(2));
			person.setAge(result.getInt(3));
			person.setBirthday(result.getDate(4));
			person.setSalary(result.getBigDecimal(5));
			
			list.add(person);
		}
				
			
		for(Person l : list) {
			System.out.println(l);
		}
		
		
		//5、关闭数据库
		pstmt.close();   //房间门
		DataSourceUtil.closeConnection(conn);  //大门
		
		
	}



}
