package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Test {
	
	public static Object objNew(String className,String c) throws Exception {
		Object result = null;
		
		//�����ַ�ʽ��ȡClass����
		try {
			Class<?> p = Class.forName(className);

			//ͨ�������õ�����per1������ʱ�������,per1�Ǳ���������
			Object per1 = p.newInstance();    
			
			
//			Constructor<?> con = p.getConstructor(String.class);
//			Object per = con.newInstance(c); //ͨ�������õ�����
			
//			System.out.println(per.name);
			

			//�������Ҫ��public���η�
//			Constructor[] arr = p.getConstructors();
//			for(Constructor c1:arr) {
//				System.out.println(c1);
//			}
			
			//��ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����)
//   		   Constructor[] arr1 = p.getDeclaredConstructors();  
//		   for(Constructor c2:arr1) {
//				System.out.println(c2);
//			}
//   		   
//		   arr1[2].newInstance("����",30);
//		   //���Ҫִ��˽�й��죬����ʹ�ñ������ʣ����Ե����η�
//		   arr1[0].setAccessible(true);  //��������(���Ե��������η�)
//		   arr1[0].newInstance(30);
//		   
//		   arr1[1].setAccessible(true);  //��������
//		   arr1[1].newInstance(true);
//		   
//		   arr1[4].newInstance();  //Ĭ�Ϲ��췽��
		   
		 //2.��ȡ�ֶ�
		 System.out.println("************��ȡ���й��е��ֶ�********************");
		 Field[] fieldArray =  p.getFields();
	     for(Field s:fieldArray) {
	    	 System.out.println(s);
	     }
	     System.out.println("************��ȡ���е��ֶ�(����˽�С��ܱ�����Ĭ�ϵ�)********************");
	     Field[] fieldArray1 = p.getDeclaredFields();
	     for(Field s:fieldArray1) {
	    	 System.out.println(s);
	     }
	     System.out.println("*************��ȡ�����ֶ�**������***********************************");
	    
	     Field f = p.getField("name");
	     Constructor<?> con = p.getConstructor();
	     System.out.println(con);
	     Object per2 = con.newInstance();
	     

	     f.set(per2, "����");
	     
	
		 
		 
		//2.��ȡ���й��з���
		System.out.println("***************��ȡ���еġ����С�����*******************");
		Method[] methodArray = p.getMethods();
		for(Method s:methodArray) {
			System.out.println(s);
		}
		
		System.out.println("***************��ȡ���еķ���������˽�е�*******************");
		Method[] methodArray2 = p.getDeclaredMethods();
		
		Method m = p.getMethod("show1",String.class);
		System.out.println("******show1*******");
		System.out.println(m);
		
		
	    m.invoke(per2, "Hello World!");   //���÷���������
		  
	    
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
