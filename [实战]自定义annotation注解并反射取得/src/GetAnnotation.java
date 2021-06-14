import java.lang.reflect.Method;

public class GetAnnotation {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class<?> c = Class.forName("User");
			//Method loginMethod = c.getMethod("login",String.class,String.class);
			Method loginMethod = c.getDeclaredMethod("login", String.class,String.class);
			
			if(loginMethod.isAnnotationPresent(Logininfo.class)) { //����true
				Logininfo my = null;
				my = loginMethod.getAnnotation(Logininfo.class);
				String username = my.name();
				String pwd = my.password();
				if(User.login(username, pwd)) {
					System.out.println("�û�����������ȷ!");
				}else {
					System.out.println("�û������������!");
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
