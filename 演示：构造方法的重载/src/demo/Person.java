package demo;

class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	//含有一个整型参数的构造方法
	public Person(int age) {
		name = "hehr";   //只提供一个参数，则用kehr初始化name
		this.age = age;
	}
	//含有一个字符串型的参数和一个整型参数的构造器
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		System.out.println("我叫：" + name + "我今年：" + age + "岁");
	}
}
