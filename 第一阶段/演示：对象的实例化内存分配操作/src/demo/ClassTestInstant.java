package demo;

public class ClassTestInstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = null;  //声明对象
		book = new Book();    //实例化一个对象
		book.title = "Java程序";
		book.price = 39.8;
		book.printInfo();
	}

}
