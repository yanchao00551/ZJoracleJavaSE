package demo;

abstract class Person {    
	//定义一个抽象类，抽象类和普通类区别可以使用抽象方法，其他无区别，模板

	String name;
	int age;
	String occupaation;
	
	//没有{},要以；结尾，没有方法体 这种方法称为抽象方法，子类中必须覆写实现
	public abstract String talk();

}
