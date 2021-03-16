package demo;

import java.util.Comparator;

/*
 *额外建立，比较规则类，实现Comparator接口 覆写compare方法
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
