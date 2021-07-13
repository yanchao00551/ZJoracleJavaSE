
public class Book {
	private String title;
	private double price;
	public Book(String title,double price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "图书名称："+this.title+"价格："+this.price;
	}
	
	
}
