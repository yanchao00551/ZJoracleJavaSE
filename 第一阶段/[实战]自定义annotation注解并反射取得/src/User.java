import java.util.Scanner;

public class User {
	@Logininfo(name="yanchao",password="123")
	public static boolean login(String name,String password) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������û�����");
		String u = scan.next();
		System.out.println("���������룺");
		String p = scan.next();
		if(u.equals(name) && p.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
