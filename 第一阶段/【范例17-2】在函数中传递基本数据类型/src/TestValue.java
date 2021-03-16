
public class TestValue {
	public static void change(int i,int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 4;
		change(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	

}
