package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList  = new ArrayList<Book>();
		bookList.add(new Book("Oracle����",60));
		bookList.add(new Book("java����",69.8));
		bookList.add(new Book("JavaWeb����ʵս",59.8));
		bookList.add(new Book("Android����",58));
	    System.out.println("------��ʼ���鼮������-������------");
		for(Book l:bookList) {
			System.out.println(l);
		}
		
		Object[] obj = bookList.toArray();
		Arrays.sort(obj); //Ϊ������������
		System.out.println("------���༯ת����������sort����������-------");
		System.out.println(Arrays.toString(obj));
		
		for(int i=0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
	
	   System.out.println("-----�������������ת���༯����Ϊ����������������ListҲ������õ�------");
		List<Object> asL = new ArrayList<Object>();
		asL = Arrays.asList(obj);
		for(Object s:asL) {
			System.out.println(s);
		}
		
	}

}
