package com.demo.test;

import com.demo.service.*;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//即使写成了多态性  但是客户端必须依赖接口的实现类
	   //所以实现类和接口高度耦合   这个问题 框架可以解决
		IOrder o = new OrderImpl();
		o.diancan();
	}

}
