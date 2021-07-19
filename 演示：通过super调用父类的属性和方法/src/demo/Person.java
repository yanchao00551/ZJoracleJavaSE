	package demo;

class Person {
	String name;
	int age;
	
	//父类的构造方法
	public Person() {
		
	}
	
	public String talk() {
		return "我是:" + this.name +"我今年 " + this.age + "岁";
	}

}
