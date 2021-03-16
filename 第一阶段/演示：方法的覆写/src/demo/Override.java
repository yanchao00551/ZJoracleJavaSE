package demo;

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =  new Student("张三",25,"HAUT");
		//此时调用的是子类中的talk()方法
		System.out.println(s.talk());
	}

}
