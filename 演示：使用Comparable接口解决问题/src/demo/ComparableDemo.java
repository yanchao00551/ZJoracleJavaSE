package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList  = new ArrayList<Book>();
		bookList.add(new Book("Oracle开发",60));
		bookList.add(new Book("java开发",69.8));
		bookList.add(new Book("JavaWeb开发实战",59.8));
		bookList.add(new Book("Android开发",58));
	    System.out.println("------初始化书籍进集合-无排序------");
		for(Book l:bookList) {
			System.out.println(l);
		}
		
		Object[] obj = bookList.toArray();
		Arrays.sort(obj); //为对象数组排序
		System.out.println("------将类集转成数组后调用sort排序后的内容-------");
		System.out.println(Arrays.toString(obj));
		
		for(int i=0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	
	   System.out.println("-----将已排序的数组转成类集，因为数组是已排序所以List也是排序好的------");
		List<Object> asL = new ArrayList<Object>();
		asL = Arrays.asList(obj);
		for(Object s:asL) {
			System.out.println(s);
		}
		
	}

}
