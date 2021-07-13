package demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GetAnnotations {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Class<?> cls = Class.forName("demo.Info");
		 Method  toStringMethod = cls.getMethod("toString");
		 //取得该方法的Annotation
		 Annotation ans[] = toStringMethod.getAnnotations();
		 
		 for(int i=0; i<ans.length; i++) {
			 System.out.println(ans[i]);
		 }
		 
	}

}
