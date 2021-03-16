package demo;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明并实例化一个Person对象引用p
		Person p = new Person();
		//给p中的属性赋值
		p.setName("kehr");
		//在这里将p对象中的年龄属性赋值为22岁
		p.setAge(22); 
		p.talk();
	}

}
