import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comparableDemo {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Oracl����ʵս",60));
		bookList.add(new Book("Java����ʵս",69.8));
		bookList.add(new Book("Java Web����ʵս",59.8));
		bookList.add(new Book("Android����ʵս",58));
		Object obj[] = bookList.toArray();
		Arrays.sort(obj);   //Ϊ������������
		System.out.println(Arrays.toString(obj));
	}
}
