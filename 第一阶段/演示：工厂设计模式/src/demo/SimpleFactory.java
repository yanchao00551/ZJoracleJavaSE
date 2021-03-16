package demo;


/*
 * 此案例中发现在主类之中直接让一个具体的子类和一个接口绑定在一起，那么如果要修改使用
 * 的子类，对于程序而言，就意味着要修改主类。所以此时程序之中就出现了接口和子类的耦合问题
 * 为了解决这个问题，使用工厂模式
 */


public class SimpleFactory {
	public static void main(String[] args) {
		 Fruit f = new Apple();    //子类为接口实例化
		 f.eat();
	}
}
