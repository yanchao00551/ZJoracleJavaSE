package demo;

//同包直接使用Class，不用导包


public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p1 = new Person();
//		p1.name = "张三";
//		p1.age = 25;
//		p1.talk();
		
		
		//创建匿名对象, 匿名对象不支持属性赋值
		new Person().talk();
	
		
	}

}


