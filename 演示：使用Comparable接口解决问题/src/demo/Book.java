package demo;

class Book implements Comparable<Book>{

	private String title;
	private double price;
	
	public Book(String title,double price) {
		this.title = title;
		this.price = price;     //���ռ۸�����
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	/*
	 * �ó�Ա������compareTo�Ķ����βαȽ�
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
