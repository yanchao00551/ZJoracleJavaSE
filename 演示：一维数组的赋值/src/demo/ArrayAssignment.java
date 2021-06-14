package demo;

import java.util.Random;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] a = null;
		//开辟内存空间, rand.nextInt(10) 返回一个[0,10]的随机整数
		a = new int[rand.nextInt(10)];
		
		System.out.println("数组的长度为：" + a.length);
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] =" + a[i]);
		}
		
	}

}
