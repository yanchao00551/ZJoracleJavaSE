package demo;

import java.lang.reflect.Method;

public class GetAnnotation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("demo.Info");
		Method toStringMethod = cls.getMethod("toString");
		//�жϸ÷������Ƿ���ָ�����͵�Annotation����
		if(toStringMethod.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation my = null;   //����Annotation�Ķ���
			my  = toStringMethod.getAnnotation(MyAnnotation.class);
			String key = my.key();
			String value = my.value();
			System.out.println(key + "----->" + value);
		}
	
	}

}
