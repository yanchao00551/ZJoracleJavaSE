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
 * 连接JDBC
 * @author 10947
 *
 */
public class ConnectJDBC {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //表示数据库的连接的对象
		conn = DataSourceUtil.openConnection();
		
		//3、 写需要执行的SQL
		Statement stmt = null;     //操作数据库
		stmt = conn.createStatement();
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES ('张三','28', NOW(), 9000.0)";
		String sqlUpdate = "UPDATE `person` SET `name`='李四', `age`='33',  `salary`='12000.00' WHERE `pid`='2'" ;
		String sqlSelect = "SELECT * FROM `person` LEFT JOIN  `book` ON `person`.like_bid = `book`.b_id WHERE 	1=1  ";
		//stmt.executeUpdate(sqlInsert);  //支持新增和更新的SQL
		
		ResultSet result =  stmt.executeQuery(sqlSelect);
		
		List<LinkedHashMap<String,Object>> mapList = new ArrayList<>();
		//Map<String,Object> map = new HashMap<>();  //put的顺序   不会保持是你put过程中的顺序
		
		while(result.next()) {
			/*主表字段*/
			int pid =  result.getInt("pid");
			String name = result.getString("name");
			int age = result.getInt("age");
			Date birthday = result.getDate("birthday");
			BigDecimal salary = result.getBigDecimal("salary");
			int likeBid = result.getInt("like_bid");
			/*从表字段*/
			String bName  = result.getString("b_name");
			int publisherId = result.getInt("p_id");
			String bAuthor = result.getString("b_author");
			Double bPrice = result.getDouble("b_price");
			
			LinkedHashMap<String,Object> map = new LinkedHashMap<>();  //能够保持put进去的顺序

			/* 取出主表字段结果*/
			map.put("主键", pid);
			map.put("姓名", name);
			map.put("年龄", age);
			map.put("生日", birthday);
			map.put("薪水", salary);
			map.put("书籍ID", likeBid);
			/*取出从表字段结果*/
			map.put("书籍名称", bName);
			map.put("出版社ID", publisherId);
			map.put("作者", bAuthor);
			map.put("价格", bPrice);
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
		
		
		//3、关闭数据库
		DataSourceUtil.closeConnection(conn);
		
		
		
	}

}
