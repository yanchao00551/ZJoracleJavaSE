package demo;

public class TestSingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个Person类的对象
		Person p1;
		p1 = Person.getPerson();
		
		
		Person p2;
		p2 = Person.getPerson();
		
		if(p1 == p2) {
			System.out.println("姓名：" + p1.name);
			System.out.println("姓名：" + p2.name);
		}
		
	}

}
