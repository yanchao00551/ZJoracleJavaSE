package demo;

public class Student extends Person {

	private float math;
	private float english;
	

	public Student(String name, String addr, String sex, Integer age, float math, float english) {
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}
	
	public Student(float math, float english) {
		super();
		this.math = math;
		this.english = english;
	}
	
	public Student() {
		this.math = 99.9f;
		this.english = 88.8f;
	}
	




	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("math:"+this.math+"english:"+this.english);
		System.out.println("name:"+super.getName()+"address:"+super.getAddr()+"sex:"+super.getSex()+"age"+super.getAge());

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student("yanchao","xiangtan","1",30,88.2f,52.3f).talk();
	}

}
