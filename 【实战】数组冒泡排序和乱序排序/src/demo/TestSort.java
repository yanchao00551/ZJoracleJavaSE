package demo;

import java.util.Random;

public class TestSort {
	final static int[] a = {25,24,12,76,98,101,90,28};
	
	/**
	 * 冒泡排序
	 * @param a
	 * @param len
	 */
	static void BubbleSort(int a[], int len)
	{
		int i, j, temp;
		for (j = 0; j < len - 1; j++)
		{
			for (i = 0; i < len - 1 - j; i++)
			if (a[i] > a[i + 1])
			{
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
	}
	/**
	 * 乱序
	 * @param a
	 * @param len
	 */
	static void RandomSequence(int a[],int len) {
		Random random = new Random();
		for(int i = 0;i<len;i++) {
			int p = random.nextInt(len);
			int tmp = a[i];
			a[i] = a[p];
			a[p] = tmp;
		}
		random = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("排序前数组a的元素为:");
		for(int i=0;i<a.length;i++) {
			System.out.print("a[" + i +"] =" + a[i] + "\t");
		}
		System.out.println("");
		System.out.println("排序后数组a的元素为：");
		BubbleSort(a, a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print("a[" + i +"] =" + a[i] + "\t");
		}
		System.out.println("");
		System.out.println("乱序后数组a的元素为：");
		RandomSequence(a,a.length);
		for(int i=0;i<a.length;i++) {
			System.out.print("a[" + i +"] =" + a[i] + "\t");
		}
	}
	
	
	
}
