package demo;


//this返回当前对象的引用
class Person {
	String name;
	int age;
	
	public Person() {
	}
	
	/*
	 * 有参构造方法
	 */
	public Person(String name,int age) {
		this.name  = name;
		this.age = age;
	}
	
	public String talk() {
		return "我是: " + this.name + ",今年：" + this.age + "岁";
	}
}
