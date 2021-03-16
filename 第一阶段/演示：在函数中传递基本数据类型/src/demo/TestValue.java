package demo;

public class TestValue {
	
	/*
	 * 交换参数的值 i为1 j为2
	 */
	public static void change(int i,int j) {
		int temp = i;     //完成了两个变量值的交换
		i = j;
		j = temp;
	}	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		change(a,b);
		System.out.println("a=" + a);   //3
		System.out.println("b=" + b);   //4
	}
	
}
