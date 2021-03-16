
public class Factory {
	public static Book getInstance(String className) {
		Book book = null;
		try {
			Class<?> cls = Class.forName(className);
			book = (Book) cls.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
		
	}
}
