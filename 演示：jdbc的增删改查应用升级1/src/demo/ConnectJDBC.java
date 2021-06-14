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
import java.util.Set;

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
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES ('����','28', NOW(), 9000.0)";
		String sqlUpdate = "UPDATE `person` SET `name`='����', `age`='33',  `salary`='12000.00' WHERE `pid`='2'" ;
		String sqlSelect = "SELECT * FROM `person` LEFT JOIN  `book` ON `person`.like_bid = `book`.b_id WHERE 	1=1  ";
		//stmt.executeUpdate(sqlInsert);  //֧�������͸��µ�SQL
		
		ResultSet result =  stmt.executeQuery(sqlSelect);
		
		List<LinkedHashMap<String,Object>> mapList = new ArrayList<>();
		//Map<String,Object> map = new HashMap<>();  //put��˳��   ���ᱣ������put�����е�˳��
		
		while(result.next()) {
			/*�����ֶ�*/
			int pid =  result.getInt("pid");
			String name = result.getString("name");
			int age = result.getInt("age");
			Date birthday = result.getDate("birthday");
			BigDecimal salary = result.getBigDecimal("salary");
			int likeBid = result.getInt("like_bid");
			/*�ӱ��ֶ�*/
			String bName  = result.getString("b_name");
			int publisherId = result.getInt("p_id");
			String bAuthor = result.getString("b_author");
			Double bPrice = result.getDouble("b_price");
			
			LinkedHashMap<String,Object> map = new LinkedHashMap<>();  //�ܹ�����put��ȥ��˳��

			/* ȡ�������ֶν��*/
			map.put("����", pid);
			map.put("����", name);
			map.put("����", age);
			map.put("����", birthday);
			map.put("нˮ", salary);
			map.put("�鼮ID", likeBid);
			/*ȡ���ӱ��ֶν��*/
			map.put("�鼮����", bName);
			map.put("������ID", publisherId);
			map.put("����", bAuthor);
			map.put("�۸�", bPrice);
			mapList.add(map);
		}
		
		int i = 0;
		for(LinkedHashMap<String, Object> s:mapList) {  
			Set<Entry<String,Object>> entrySet = s.entrySet();
			Set<String>   key = s.keySet();
			Iterator<Entry<String,Object>> itr = entrySet.iterator();

			if(i == 0) {
				for(String k : key) {
					System.out.print(k  + "\t     ");
					
					
				}
				System.out.println("");
			}
			
			while(itr.hasNext()) {   
				Entry<String,Object> entry = itr.next();
				System.out.print(entry.getValue() + "\t\t");
			}
			System.out.println("");
			i++;
		}
		
		
		//3���ر����ݿ�
		DataSourceUtil.closeConnection(conn);
		
		
		
	}

}
