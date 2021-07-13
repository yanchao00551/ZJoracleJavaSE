class Book{
	private String title;
	private double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "图书名称：" + this.title +"价格："+this.price;
	}
	
}

public class TestReflection {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("Book");
		Book book = (Book) cls.newInstance();   //实例化一个对象
		book.setTitle("java开发实战");
		book.setPrice(79.8);
		System.out.println(book);
	}

}
