package demo;


//如果基类有构造方法，子类必须要有构造方法，而且要调用父类构造
class Student extends Person{
	String school;
	
	public Student(String name, int age,String school) {
		super(name, age);  //调用父类构造方法 
		// TODO Auto-generated constructor stub
		this.school = school;
	}
	
	void study() {
		System.out.println("我在 " + school + "读书");
	}
	
	
}
