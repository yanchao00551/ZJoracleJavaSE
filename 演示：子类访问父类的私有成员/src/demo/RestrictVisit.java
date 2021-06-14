package demo;

public class RestrictVisit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("张三",30);
		s.print();
		s.setVar("李四", 25);
		s.print();
	}

}
