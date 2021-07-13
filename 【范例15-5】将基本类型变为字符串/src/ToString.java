
public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		String str = x + "";  //任何类型与字符串相加之后就是字符串
		System.out.println(str);
		
		int y = 100;
		String str1 = String.valueOf(y); //也可以转
		System.out.println(str1);
	}

}
