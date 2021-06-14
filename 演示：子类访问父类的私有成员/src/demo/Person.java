package demo;

class Person {
	//在这里将属性封装 
	
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	void setVar(String name,int age) {
		this.age = age;
		this.name = name;
	}
	
	void print() {
		System.out.println("我是" + name + "今年" + age +"岁");
	}

}
