package demo;


/*
 * 数组的插入类
 */
public class ArrayInsert {
	
	/*
	 * 数组移位
	 * arr 数组引用
	 * index 移位起始下标
	 * num  移位数
	 */
	public static void arrInsert(int[] arr,int index,int num) {
		for(int j = arr.length -1 ; j>= index+num; j--) {
			if(index == Config.A.length) {
				arr[j] = arr[j - num + 1];
			}else {
				arr[j] = arr[j - num];
			}
		}
	}
	
	/*
	 * 后移算法  移动1个位置
	 */
	public static void arrInsert(int[] arr,int index) {
		for(int j = arr.length; j < index; j--) {
			arr[j] = arr[j - 1];
		}
	}
	
	
	/*
	 * 将数组a的指定长度内容赋值给数组b
	 * a[] 
	 * b[]
	 * len 指定长度
	 * index  指定从哪个下标开始
	 * 
	 * 当  形参 index为 7  的时候  起始位置，  但是这个位置 绝不能是a的 ，绝对数组下越界  b[i] = a[7]
	 */
	public static void arrToDetails(int a[],int[] b,int len,int index) {
		for(int i=index; i < len; i++) {
			b[i] = a[i];
		}
	}
	
	/*
	 * 将数组a的指定长度内容赋值给数组b   数组局部覆盖
	 * a 替换数据
	 * b 原始数据
	 * len 长度
	 * index 起始位置
	 * n  下标不一致情况下，启用n下标为数组a的下标
	 */
	public static void arrToDetails(int a[],int[] b,int len,int index,int n) {
		for(int i=index; i <= len; i++) {
			b[i] = a[n];
			n++;
		}
	}
}
