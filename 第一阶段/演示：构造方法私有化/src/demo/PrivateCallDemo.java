package demo;

public class PrivateCallDemo {
	
	//构造方法被私有化
	private PrivateCallDemo() {
		System.out.println("Private Constructor\n构造方法已被私有化");
	}
	
	public void print() {
		System.out.println("Hello World!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateCallDemo demo = null;
	    //demo.print();  //不会再编译期报错，运行期报错  NullPointException
		//demo = new PrivateCallDemo(); //出错，因该构造器私有化，外面类中不可见
	    //demo.print();
		new PrivateCallDemo();
		
	}

}
