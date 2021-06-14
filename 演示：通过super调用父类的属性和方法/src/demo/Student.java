package demo;

class Student extends Person{
	
	String school;
	
	//子类的构造方法
	public Student(String name,int age,String school) {
		//在这里用super调用父类中的属性
		super.name = name;
		super.age = age;
		
		//调用父类中的 talk()方法
		System.out.println(super.talk());
		
		this.school = school;
	}
}
