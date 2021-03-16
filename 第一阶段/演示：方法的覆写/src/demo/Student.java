package demo;

class Student extends Person{
	String school;
	public Student(String name,int age,String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	//此处为覆写Person类中的talk()方法
	public String talk() {
		return "我来自" + this.school;
	}
}
