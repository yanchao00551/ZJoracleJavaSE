
public class Book implements Comparable<Book>{
	private String title;
	private double price;
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]\n";
	}
	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.price > o.price) {
			return 1;
		}else if(this.price < o.price) {
			return -1;
		}else {
			return 0;
		}
	}

	
}
