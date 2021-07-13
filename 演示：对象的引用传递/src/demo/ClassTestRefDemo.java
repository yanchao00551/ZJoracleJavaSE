package demo;

public class ClassTestRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = null;  //声明对象p1 ,此对象值为null,未实例化
		Person p2 = null;
		p1 = new Person();
		p1.age = 20;
		p1.name = "张三";
		p2 = p1;    //将p1的引用赋给p2
		System.out.println("姓名：" + p2.name);   //张三
		System.out.println("年龄：" + p2.age);     //20
	}

}
