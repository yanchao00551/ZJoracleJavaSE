package demo;

class Book implements Comparable<Book>{

	private String title;
	private double price;
	
	public Book(String title,double price) {
		this.title = title;
		this.price = price;     //按照价格排序
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	/*
	 * 用成员属性与compareTo的对象形参比较
	 */
	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		if(this.price > b.price) {
			return 1;
		}else if(this.price < b.price) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
