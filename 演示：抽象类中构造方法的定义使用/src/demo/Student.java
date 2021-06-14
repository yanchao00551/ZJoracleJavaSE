package demo;

class Student extends Person{

	public Student(String name, int age, String occupation) {
		super(name, age, occupation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "学生->姓名：" + this.name +",年龄：" + this.age + ",职业：" + this.occupation;
	}


}
