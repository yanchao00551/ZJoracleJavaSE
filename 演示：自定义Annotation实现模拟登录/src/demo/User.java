package demo;

import java.util.Scanner;

public class User {

	/*
	 * 登录方法
	 */
	@Logininfo(name = "yanchao",password="123")
	public  static boolean login(String name,String password) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String u = scan.next();
		System.out.println("请输入密码：");
		String p = scan.next();
		if(u.equals(name) && p.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
