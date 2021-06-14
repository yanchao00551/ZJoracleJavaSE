package demo;

abstract class Person {
	String name;
	int age;
	String occupation;
	
	public Person(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	
	//声明一个抽象方法
	public abstract String talk();      
	
	

}
