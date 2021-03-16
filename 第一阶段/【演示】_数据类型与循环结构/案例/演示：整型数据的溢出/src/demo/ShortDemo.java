package demo;

public class ShortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MAX_VALUE;    //取得int 的最大值
		int min = Integer.MIN_VALUE;    //取得int 的最小值
		System.out.println(max);    //最大值输出 2147483647
		System.out.println(min);    //最小值输出 -2147483648
		System.out.println(max + 1);   //得到最小值 -2147483648
		System.out.println(max + 2);   //-2147483648 + 1
		System.out.println(min - 1);   //得到了最大值2147483647
		
	}

}
