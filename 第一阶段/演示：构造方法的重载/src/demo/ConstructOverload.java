package demo;

public class ConstructOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(23);
		Person p2 = new Person("Tom",24);
		Person p3 = new Person();  //此行有错误，不存在无参构造器
		
		p1.talk();
		p2.talk();
	}

}
