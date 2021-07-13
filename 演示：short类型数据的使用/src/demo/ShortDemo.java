package demo;

public class ShortDemo {
	
	public static void main(String[] args) {
		short short_max = Short.MAX_VALUE; //得到短整型的最大值
		short short_min = Short.MIN_VALUE;  //得到短整型的最小值
		System.out.println("SHORT的最大值：" + short_max);
		System.out.println("SHORT的最小值：" + short_min);
		System.out.println("SHORT在内存里所占位数：" + Short.SIZE);
		System.out.println("SHORT的数据类型：" + Short.TYPE);
		
	}
}