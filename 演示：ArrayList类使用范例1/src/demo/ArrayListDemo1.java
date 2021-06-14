package demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList对象
		List<String> al  = new ArrayList<String>();
		System.out.println("al中元素的个数：" + al.size());
		//向ArrayList对象中添加新内容
		al.add("C"); //在数组列表0位置添加元素C
		al.add("A"); //在数组列表1位置添加元素A
		al.add("E");  //在数组列表2位置添加元素E
		al.add("B"); //在数组列表3位置添加元素B
		al.add("D");  //在数组列表4位置添加元素D
		al.add("F");  //在数组列表5位置添加元素F
		//把A2加在ArrayList对象的第2个位置
		al.add(1, "A2");  //在1位置添加A2，列表内容为 C A2 A E B D F
		System.out.println("al加入元素之后的元素个数：" + al.size());
		
		//显示ArrayList数据
		System.out.println("al的内容：" + al);
		
		//从ArrayList中移除元素
		al.remove("F"); //删除元素F，此时数据 C A2 A E B D
		al.remove(2);  //删除下标为2的元素，此时数据列表为 C A2 E B D
		System.out.println("al删除元素之后的元素个数：" + al.size());
		System.out.println("al的内容:" + al);
		
	}

}
