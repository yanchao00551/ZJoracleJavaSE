package demo;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList对象al
		ArrayList<Integer> al = new ArrayList<Integer>();
		//向ArrayList中加入对象
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("al中的内容：" + al);
		//得到对象数组
		Object[]  ia = al.toArray();
		//计算数组内容
		int sum = 0;
		for(int i =0; i<ia.length; i++) {
			sum +=((Integer) ia[i]).intValue(); //将元素转换为Integer类型并拆箱成int基本数据类型
		}
		System.out.println("数组累加的结果是：" + sum);
	}

}
