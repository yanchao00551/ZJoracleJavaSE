package demo;

class Student extends Person{

	public Student(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupaation = occupation;
	}
	
	//实现抽象方法talk()
	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "学生->姓名" + this.name +"年龄，"+this.age +"职业"+this.occupaation;
	}


}
