package demo;

public class TestValue {
	
	/*
	 * ����������ֵ iΪ1 jΪ2
	 */
	public static void change(int i,int j) {
		int temp = i;     //�������������ֵ�Ľ���
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
