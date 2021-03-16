package demo;

/*
 * 程序首先用class声明了一个名为Person的类，在这里Person是类的名称
 * 紧接着声明了两个属性
 * 声明了无返回值(void)的方法talk()
 */
public class Person {
	String name;
	int age;
	void talk() {
		System.out.println("我是：" + name + ", 今年：" + age + "岁");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "张三";
		p.age = 45;
	    p.talk();  //p是Person对象的引用发送消息（talk()方法)到Person对象
	}
}
