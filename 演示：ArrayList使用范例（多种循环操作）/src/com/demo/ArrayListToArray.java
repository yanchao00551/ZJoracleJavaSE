package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList对象
		List<Person> al = new ArrayList<>();
		//向ArrayList中加入对象
		al.add(new Person("我",12));
		al.add(new Person("爱",13));
		al.add(new Person("中",14));
		al.add(new Person("国",15));
		System.out.println("ArrayList中的内容:" + al);
		
		

		//普通for循环
		System.out.println("----------普通for-------------");
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		

		//增强for遍历ArrayList
		System.out.println("----------增强for-------------");
		for(Person p:al) {
			System.out.println(p);
		}
		
		//while循环
		System.out.println("----------while-------------");
		int j = 0;
		while(j < al.size()) {
			System.out.println(al.get(j));
			j++;
		}
		
		
		//do while循环
		System.out.println("----------do while-------------");
		int d = 0;
		do {
			if(al.get(d) != null) {
				System.out.println(al.get(d));
			}			
			d++;
		}
		while(d < al.size());
		
		
		

		/**
		 * stream流中的forEach循环
		 * 发现他报错：Variable used in lambda expression should be final or effectively final,
		 * 意思是不允许在Lambda表达式中修改使用的（外部）变量。
		 * 后来发现了有规避的方法但不推荐使用，即写一个方法，
		 * 在循环中调用该方法。推荐使用 Lambda提供的Steam流的规约操作，
		 * java.util.stream包提供了各种通用的和专用的规约操作
		 * （例如sum、min和max）
		 */
		System.out.println("------- forEach -----------");
		//foreach循环
		al.forEach((v) ->{
			System.out.println(v);
		});
		int sum1 = al.stream().mapToInt(e -> e.age).sum();
		

		
		//单项迭代器
		System.out.println("---------Iterator---------");
		Iterator<Person> itr = al.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			sum1 += p.age;
			System.out.println(p);
		}
		 
		
		
		//双向迭代 调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator
		System.out.println("--------ListIterator----------");
		ListIterator<Person> listItr = al.listIterator(al.size());
		while(listItr.hasPrevious()) {
			Person p1 = listItr.previous();
			System.out.println(p1);
		}
	
		//得到对象内容 转型数组
		Object[] ia = al.toArray();
		
		
	}

}
