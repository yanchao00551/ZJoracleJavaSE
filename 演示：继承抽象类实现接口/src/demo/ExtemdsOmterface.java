package demo;

public class ExtemdsOmterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		A a = x;
		B b = x;
		C c = x;
		a.print();
		b.get();
		c.fun();
	}

}
