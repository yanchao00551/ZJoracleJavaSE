package demo;

class Person {
	String name;
	private static final Person PERSON = new Person(); //已经执行了当前类私有构造器
	
	
	private Person() {
		name = "kehr";
	}
	
	public static Person getPerson() {
		return PERSON; 
	}
	
}
