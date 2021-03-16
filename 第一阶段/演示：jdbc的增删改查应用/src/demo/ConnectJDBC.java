package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * ����JDBC
 * @author 10947
 *
 */
public class ConnectJDBC {
	//�����������֮ǰ��classpath�����õ�jdbc�����������jar����
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	//���ӵ�ַ���ɸ������ݿ������̵����ṩ�ģ�����Ҫ������ס
	public static final String DBURL = "jdbc:mysql://127.0.0.1:3306/order?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
	//�������ݿ���û�
	public static final String DBUSER = "root";
	//�������ݿ������
	public static final String DBPASS = "root";
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = null;       //��ʾ���ݿ�����ӵĶ���
		
		//1    ʹ��Class�������������
		Class.forName(DBDRIVER);
		
		//2���������ݿ�
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		System.out.println(conn);
		
		
		//3�� д��Ҫִ�е�SQL
		Statement stmt = null;     //�������ݿ�
		stmt = conn.createStatement();
		String sqlInsert = "INSERT INTO `person` (`name`, `age`, `birthday`, `salary`) VALUES ('����','28', NOW(), 9000.0)";
		String sqlUpdate = "UPDATE `person` SET `name`='����', `age`='33',  `salary`='12000.00' WHERE `pid`='2'" ;
		stmt.executeUpdate(sqlUpdate);  //֧�������͸��µ�SQL
		
		//3���ر����ݿ�
		conn.close();
		
		//������ϰ :
		//ʹ�õ������ģʽ�Ż��˰���
		//properties��load����ʵ�� �����ַ������뵽�ⲿ�����ļ����ж�ȡ
		
		
		
	}

}
