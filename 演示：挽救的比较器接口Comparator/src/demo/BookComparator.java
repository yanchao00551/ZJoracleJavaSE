package demo;

import java.util.Comparator;

/*
 *���⽨�����ȽϹ����࣬ʵ��Comparator�ӿ� ��дcompare����
 */
class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice() > o2.getPrice()) {
			return 1;
		}else if(o1.getPrice() < o2.getPrice()) {
			return -1;
		}else {
			return 0;			
		}
	}
}
