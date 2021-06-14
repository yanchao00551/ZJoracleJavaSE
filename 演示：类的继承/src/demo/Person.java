package demo;

class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	void speak() {
		System.out.println("我的名字叫：" + name + "我" + age + "岁");
	}
}
