import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comparableDemo {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Oracl开发实战",60));
		bookList.add(new Book("Java开发实战",69.8));
		bookList.add(new Book("Java Web开发实战",59.8));
		bookList.add(new Book("Android开发实战",58));
		Object obj[] = bookList.toArray();
		Arrays.sort(obj);   //为对象数组排序
		System.out.println(Arrays.toString(obj));
	}
}
