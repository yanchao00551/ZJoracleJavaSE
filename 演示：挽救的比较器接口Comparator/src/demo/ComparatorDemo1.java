package demo;

import java.util.Arrays;

public class ComparatorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book[] = new Book[] {
				new Book("Oracleʵս",60),
				new Book("Java����",69.8),
				new Book("Java Web����",59.8),
				new Book("Android����",58)
		};
		
		Arrays.sort(book, new BookComparator());   //Ϊ������������
		System.out.println(Arrays.toString(book));
		
	}

}
