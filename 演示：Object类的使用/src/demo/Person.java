package demo;

/*
 * Object类
 * 取得对象信息 toString()
 * Object类的toString()方法是在打印对象被调用，将对象变为字符串返回。默认的
 * toString()方法有一个特点：为了适用于所有的子类，toString()在默认情况下
 * 输出对象参考地址
 * 
 */

class Person extends Object{
	String name = "张三";
	int age = 25;
}
