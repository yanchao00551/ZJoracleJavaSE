package demo;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X(); 
		A a = x;  //为父接口实例化，多态性
		B b = x;  //为父接口实例化，多态性
		
		A c = new X();
		a.print();  
		b.get();
		c.print();
	}

}
