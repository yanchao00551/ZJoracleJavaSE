package demo;

class Message {
	
	
	 //可以省略,建议不省略
	@Override
	public String toString() {   //原本是打算覆写toString()
		return "Hello World!";
	}
	
	@Deprecated
	public String getInfo() {
		return "hello world";
	}
	
	
}
