package demo;

interface InterfaceA {
	public static String INFO = "static final";
	
	public void print();  //抽象方法  可以省略abstract
	
	default public void otherprint() {
		System.out.println("print default1 methods interfaceA!");
	}
}
