package demo;


public class ArrayInsert {
	

	/*
	 * 后移算法 移动指定位置
	 * arr 待插入数组
	 * index 插入起始位置下标
	 * num 插入位置
	 */
	public static void arrInsert(int[] arr,int index,int num) {
		for(int j = arr.length-1;j >= index + num; j--) {
			arr[j] = arr[j - num];
		}
	}
	
	
	/*
	 * 后移算法 移动1个位置
	 */
	public static void arrInsert(int[] arr,int index) {
		for(int j = arr.length;j < index; j--) {
			arr[j] = arr[arr.length - 1];
		}
	}
	
	/*
	 * 将数组a的指定长度内容赋值给数组b 
	 * len 长度
	 * index 起始位置
	 * 
	 * 
	 */
	public static void arrToDetails(int[] a ,int[] b,int len,int index) {
		for(int i=index; i<len; i++) {
			b[i] = a[i];
		}
	}
	
	/*
	 * 将数组a的指定长度内容赋值给数组b 数组局部覆盖  
	 * len 长度
	 * index 起始位置
	 * n 下标不一致情况下 启用n下标为数组a的下标
	 */
	public static void arrToDetails(int[] a ,int[] b,int len,int index,int n) {
		for(int i=index; i<=len; i++) {
			b[i] = a[n];
			n++;
		}
	}
	
	
	

	
	
}
