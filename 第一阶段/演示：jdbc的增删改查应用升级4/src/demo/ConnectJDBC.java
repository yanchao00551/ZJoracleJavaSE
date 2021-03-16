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
 * PrepararedStatement�ӿ�ȡ��Statemtn�ӿ�
 * �������� ���޸�����
 * @author 10947
 *
 */
public class ConnectJDBC {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //��ʾ���ݿ�����ӵĶ���
		conn = DataSourceUtil.openConnection();
		
		//3�� д��Ҫִ�е�SQL
		PreparedStatement pstmt = null;     //Ԥ�������  �������ݿ�  

		/*
		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		String name = input.next();
		System.out.println("���������䣺");
		int age = input.nextInt();
		System.out.println("���������գ�");
		String date = input.next();
		System.out.println("������Ա�����ʣ�");
		BigDecimal salary = input.nextBigDecimal();
		*/
		
		//1��дԤ����SQL
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES (?,?,?,?)";  //Ԥ�������
		
		String sqlUpdate = "UPDATE `person` SET `name`= ?, `age`= ?,  `salary`= ? WHERE `pid`= ?" ;
		
		//Ԥ����SQL
		String sqlSelect2 = "SELECT * FROM `person` LEFT JOIN  `book` ON `person`.like_bid = `book`.b_id WHERE 	1=1 "; //����
		
		// Ԥ����SQL ������д����
		String sqlSelect1 = "SELECT * FROM `person` WHERE 	1=1  ORDER BY `birthday` DESC LIMIT ?,?";  //����
				
		List<Person> list = new ArrayList<>();
		
		// 2��PreparedStatement�ӿ���Ҫͨ��Connection�ӿڽ���ʵ����������ͬʱ����Ԥ����SQL
		pstmt = conn.prepareStatement(sqlSelect2);
		// 3����Ԥ����SQL  �� ռλ�� �� ֵ 
		
		//����
		//int currentPage = 3;   //��ǰҳ
		//int pageSize  = 2;    
		//int startIndex = (currentPage - 1) * pageSize;
		//pstmt.setInt(1, startIndex);   //��1�� ?  ������ռλ��) ������  
		//pstmt.setInt(2, pageSize);
		
		//pstmt.setBigDecimal(3, salary);
		//pstmt.setInt(4, 6);
		
		//4��ִ��SQL��䣬�������ݿ�
		//pstmt.executeUpdate();
		
		//ResultSet result = pstmt.executeQuery(sqlSelect2);       //�вε�����µ��õ���  Statement�ӿ�
		ResultSet result = pstmt.executeQuery();   //���޲ε�����£����õ��� PreparedStatement �ӿ�
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
		
		
		//5���ر����ݿ�
		pstmt.close();   //������
		DataSourceUtil.closeConnection(conn);  //����
		
		
	}



}
