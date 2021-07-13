package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 连接JDBC
 * @author 10947
 *
 */
public class ConnectJDBC {
	//驱动程序就是之前在classpath中配置的jdbc的驱动程序的jar包中
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	//连接地址是由各个数据库生产商单独提供的，所以要单独记住
	public static final String DBURL = "jdbc:mysql://127.0.0.1:3306/order?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
	//连接数据库的用户
	public static final String DBUSER = "root";
	//连接数据库的密码
	public static final String DBPASS = "root";
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //表示数据库的连接的对象
		
		//1    使用Class类加载驱动程序
		Class.forName(DBDRIVER);
		
		//2、连接数据库
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		System.out.println(conn);
		
		
		//3、 写需要执行的SQL
		Statement stmt = null;     //操作数据库
		stmt = conn.createStatement();
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES ('张三','28', NOW(), 9000.0)";
		String sqlUpdate = "UPDATE `person` SET `name`='李四', `age`='33',  `salary`='12000.00' WHERE `pid`='2'" ;
		stmt.executeUpdate(sqlUpdate);  //支持新增和更新的SQL
		
		//3、关闭数据库
		conn.close();
		
		//课堂练习 :
		//使用单例设计模式优化此案例
		//properties类load方法实现 连接字符串分离到外部配置文件进行读取
		
		
		
	}

}
