package demo;

import java.lang.reflect.Method;

public class GetAnnotatoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class<?> c =  Class.forName("demo.User");
			Method loginMethod = c.getDeclaredMethod("login", String.class,String.class);
			if(loginMethod.isAnnotationPresent(Logininfo.class)) {
				Logininfo my = null;
				my = loginMethod.getAnnotation(Logininfo.class);
				String username = my.name();
				String pwd = my.password();
				if(User.login(username, pwd)) {
					System.out.println("µÇÂ¼³É¹¦£¡");
				}else {
					System.out.println("µÇÂ¼Ê§°Ü£¡");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
