package demo;

public class TypeChange {

	/*
	 * 类型转换
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int before = 20;            
		double rise = 9.8;
		
		int now = before + (int)rise;  
		 
		System.out.println("强制类型转换后now： " + now);
	}

}
