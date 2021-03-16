package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Test {
	
	public static Object objNew(String className,String c) throws Exception {
		Object result = null;
		
		//第三种方式获取Class对象
		try {
			Class<?> p = Class.forName(className);

			//通过反射拿到对象，per1运行期时候产生了,per1非编译器产生
			Object per1 = p.newInstance();    
			
			
//			Constructor<?> con = p.getConstructor(String.class);
//			Object per = con.newInstance(c); //通过反射拿到对象
			
//			System.out.println(per.name);
			

			//构造必须要有public修饰符
//			Constructor[] arr = p.getConstructors();
//			for(Constructor c1:arr) {
//				System.out.println(c1);
//			}
			
			//获取所有的构造方法(包括私有、受保护、默认、公有)
//   		   Constructor[] arr1 = p.getDeclaredConstructors();  
//		   for(Constructor c2:arr1) {
//				System.out.println(c2);
//			}
//   		   
//		   arr1[2].newInstance("张三",30);
//		   //如果要执行私有构造，可以使用暴力访问，忽略掉修饰符
//		   arr1[0].setAccessible(true);  //暴力访问(忽略掉访问修饰符)
//		   arr1[0].newInstance(30);
//		   
//		   arr1[1].setAccessible(true);  //暴力访问
//		   arr1[1].newInstance(true);
//		   
//		   arr1[4].newInstance();  //默认构造方法
		   
		 //2.获取字段
		 System.out.println("************获取所有公有的字段********************");
		 Field[] fieldArray =  p.getFields();
	     for(Field s:fieldArray) {
	    	 System.out.println(s);
	     }
	     System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
	     Field[] fieldArray1 = p.getDeclaredFields();
	     for(Field s:fieldArray1) {
	    	 System.out.println(s);
	     }
	     System.out.println("*************获取公有字段**并调用***********************************");
	    
	     Field f = p.getField("name");
	     Constructor<?> con = p.getConstructor();
	     System.out.println(con);
	     Object per2 = con.newInstance();
	     

	     f.set(per2, "张三");
	     
	
		 
		 
		//2.获取所有公有方法
		System.out.println("***************获取所有的”公有“方法*******************");
		Method[] methodArray = p.getMethods();
		for(Method s:methodArray) {
			System.out.println(s);
		}
		
		System.out.println("***************获取所有的方法，包括私有的*******************");
		Method[] methodArray2 = p.getDeclaredMethods();
		
		Method m = p.getMethod("show1",String.class);
		System.out.println("******show1*******");
		System.out.println(m);
		
		
	    m.invoke(per2, "Hello World!");   //调用方法并传参
		  
	    
		result = per2;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Object p = objNew("demo.entity.Teacher","Hello World!");
		System.out.println(p);
		
		
		
	}

}
