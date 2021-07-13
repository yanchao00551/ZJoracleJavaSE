import java.lang.reflect.Constructor;

public class TestInstance {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book book = null;
		Class<?> cls = Class.forName("Book");
		Constructor<?> constructor = cls.getConstructor(String.class,double.class);
		book = (Book) constructor.newInstance("java¿ª·¢",79.8);
		System.out.println(book);
	}

}
