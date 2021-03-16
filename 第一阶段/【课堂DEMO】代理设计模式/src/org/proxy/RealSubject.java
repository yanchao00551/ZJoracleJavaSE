package org.proxy;

/**
 * 红酒厂商（真实角色）
 * @author 10947
 *
 */
public class RealSubject extends Subject{

	@Override
	public void request() {  //覆写实现了抽象方法
		// TODO Auto-generated method stub
		System.out.println("我是红酒厂商，欢迎品尝购买！");
	}
	
}
