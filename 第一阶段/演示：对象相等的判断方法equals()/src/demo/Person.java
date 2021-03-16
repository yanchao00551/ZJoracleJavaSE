package demo;

class Person {
	private String name;
	private int age;
	
	
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean temp = true; //假设相等
		
		//声明p1对象 此对象实际上就是当前调用equeals方法的对象
		Person p1 = this;
		//判断Object类对象是否是Person的实例
		if(obj instanceof Person) {
			//如果是Person类实例，则进行向下转型
			Person p2 = (Person)obj;
			//调用String类中的equals方法
			if(!(p1.name.equals(p2.name)) && p1.age == p2.age) {
				temp = false;
			}
		}else {
			//如果不是Person类实例，则直接返回false
			temp = false; 
		}
		
		return temp;
	}
	
	
	
	
}
