package demo;

import java.util.Arrays;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book[] = new Book[] {
				new Book("Oracle实战",60),
				new Book("Java开发",69.8),
				new Book("Java Web开发",59.8),
				new Book("Android开发",58)
		};
		
		Arrays.sort(book, new BookComparator());   //为对象数组排序
		System.out.println(Arrays.toString(book));
		
	}

}
