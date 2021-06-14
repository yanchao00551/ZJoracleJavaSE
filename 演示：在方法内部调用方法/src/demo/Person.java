package demo;

class Person {

	private String name;
	private int age;
	
	public void talk() {
		System.out.println("我是：" + name +" 今年:" + age +"岁!");
	}
	

	
	//getter和setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
