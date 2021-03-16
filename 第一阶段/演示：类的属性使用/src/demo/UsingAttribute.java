package demo;

public class UsingAttribute {
	static String a = "string-a";
	
	static String b;
	
	String c = "string-c";
	String d;
	
	//static语句块用于初始化static成员变量，是最先运行的语句块
	static {
		printStatic("before static");
		b = "string-b";
		printStatic("after static");  
	}
	
	//输出静态成员变量
	public static void printStatic(String title) {
		System.out.println("--------" + title + "---------");
		System.out.println("a = \"" + a + "\"");
		System.out.println("b = \"" + b + "\"");
	}

	public UsingAttribute() {
		System.out.println("before construcotr");
		d = "string-d";
		System.out.println("after constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UsingAttribute();
	}

}
