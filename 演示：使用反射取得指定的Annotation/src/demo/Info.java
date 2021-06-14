package demo;

public class Info {
	
	@Override
	@Deprecated
	@SuppressWarnings(value = "")
	@MyAnnotation(key="one",value="test")
	public String toString() {
		return "hello";
	}
}
