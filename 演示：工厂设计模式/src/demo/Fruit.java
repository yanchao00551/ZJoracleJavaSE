package demo;

/*
 * 工厂设计模式：
 * 在面向对象编程中，最通常的方法是一个new操作符产生一个对象实例，new操作符就是用来
 * 构造对象实例的。但是在一些情况下，new操作符直接生成对象会带来一些问题。举例来说：
 * 许多类型对象的创造需要一系列的步骤。你可以需要计算或取得对象的初始设置；选择生成哪个
 * 子对象实例；或在生成你需要的对象之前必须生成一些辅助功能的对象。在这些情况下，新对象
 * 的建立就是一个“过程“，不在是一个单步操作，就更像一个大机器中的批量齿轮转动。
 * 如何来来创建这么”复杂”的对象呢？ 构件一个工厂模式，来创建新的对象
 */

//定义一个水果标准
interface Fruit {
	public void eat();
}
