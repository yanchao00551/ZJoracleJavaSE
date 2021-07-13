package demo;

import java.lang.reflect.Method;

public class GetAnnotation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("demo.Info");
		Method toStringMethod = cls.getMethod("toString");
		//判断该方法上是否有指定类型的Annotation存在
		if(toStringMethod.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation my = null;   //声明Annotation的对象
			my  = toStringMethod.getAnnotation(MyAnnotation.class);
			String key = my.key();
			String value = my.value();
			System.out.println(key + "----->" + value);
		}
	
	}

}
