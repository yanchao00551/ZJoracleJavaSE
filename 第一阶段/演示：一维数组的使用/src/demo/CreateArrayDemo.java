package demo;

public class CreateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = null;
		a = new int[3];  //开辟内存空间供整型数组a使用，其元素个数为3
		
		System.out.println("数组长度是：" + a.length);  //输出数组长度
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] =" + a[i]); //默认值0
		}
	}

}
