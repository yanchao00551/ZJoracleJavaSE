package demo;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {74,48,30,17,62};   //声明整数数组，并赋初始值
		int max = a[0];   //存储最大的元素，假设第一个元素就是最大的
		int min = a[0];   //存储最小的元素，假设第一个元素就是最小的
		
		System.out.println("数组a的元素包括：");
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
			if(a[i] > max) {
				max = a[i];
			}else if(a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.println("\n 数组的最大值是：" + max);
		System.out.println(" 数组的最小值是：" + min);
	}

}
