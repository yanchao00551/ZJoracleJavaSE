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
		return "ͼ�����ƣ�" + this.title +"�۸�"+this.price;
	}
	
}

public class TestReflection {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> cls = Class.forName("Book");
		Book book = (Book) cls.newInstance();   //ʵ����һ������
		book.setTitle("java����ʵս");
		book.setPrice(79.8);
		System.out.println(book);
	}

}
