package demo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * ����JDBC
 * @author 10947
 *
 */
public class ConnectJDBC {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //��ʾ���ݿ�����ӵĶ���
		conn = DataSourceUtil.openConnection();
		
		//3�� д��Ҫִ�е�SQL
		Statement stmt = null;     //�������ݿ�
		stmt = conn.createStatement();
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		String name = input.next();
		System.out.println("���������䣺");
		int age = input.nextInt();
		System.out.println("���������գ�");
		String date = input.next();
		System.out.println("������Ա�����ʣ�");
		BigDecimal salary = input.nextBigDecimal();
		
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES ('" + name +"','" + age +"','"+date+"', " + salary + ")";
		System.out.println(sqlInsert);
		String sqlUpdate = "UPDATE `person` SET `name`='����', `age`='33',  `salary`='12000.00' WHERE `pid`='2'" ;
		String sqlSelect2 = "SELECT * FROM `person` LEFT JOIN  `book` ON `person`.like_bid = `book`.b_id WHERE 	1=1  "; //����
		
		String sqlSelect1 = "SELECT * FROM `person` WHERE 	1=1  ORDER BY `birthday` DESC";  //����
		
		stmt.executeUpdate(sqlInsert);  //֧�������͸��µ�SQL
		
		List<Person> list = new ArrayList<>();
		
		ResultSet result =  stmt.executeQuery(sqlSelect1);

		while(result.next()) {
			Person person  = new Person();

			/*�����ֶ�*/
			person.setPid(result.getInt(1));
			person.setName(result.getString(2));
			person.setAge(result.getInt(3));
			person.setBirthday(result.getDate(4));
			person.setSalary(result.getBigDecimal(5));
			person.setLikeBid(result.getInt(6));
			
			
			
			/*�ӱ��ֶ�*/
//			person.setbName(result.getString("b_name"));
//			person.setPid(result.getInt("p_id"));
//			person.setbAuthor(result.getString("b_author"));
//			person.setbPrice(result.getDouble("b_price"));
			
			list.add(person);
		}
		
		for(Person s:list) {
			System.out.println(s);
		}
		

		
		//3���ر����ݿ�
		DataSourceUtil.closeConnection(conn);
		
		
		
	}



}
