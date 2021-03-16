package demo;

public class Info {
	
	/*
	 * 系统内置注解
	 */
	
	@Override
	@Deprecated
	@SuppressWarnings(value="This is a warning")
	public String toString() {
		return "Hello World!";
	}
	
}
