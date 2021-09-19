package org.proxy;

/**
 * 代理角色 （代理商  AOP里的需要我们实现的某个具体类）
 * @author 10947
 *
 */
public class ProxySubject extends Subject {
	private RealSubject realSubject;  //以真实角色作为代理角色的属性
	

	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();  //买红酒 ，免费品尝 买2送1
		
		
		//买红酒  
		if(realSubject == null) {
			realSubject = new RealSubject();  // DI 依赖注入
		}

		realSubject.request();  //真实对象的request方法
		
		
		lastRequest();  //付款   首先客户付款给代理商  或者 付款给厂家  广告宣传后礼品
		
	}

	
	//这是客户还没有买之前  代理商自定义的方法  AOP  前置增强处理 
	private void preRequest() {
		// TODO Auto-generated method stub
		System.out.println("买红酒 ，免费品尝 买2送1 这是客户还没有买之前  代理商自定义的方法  AOP  前置增强处理 ");
	}


	//这是执行完 厂商真实角色 （ServiceImpl)中某个方法后的 方法   后置增强处理
	private void lastRequest() {
		// TODO Auto-generated method stub
		System.out.println("付款   首先客户付款给代理商  或者 付款给厂家  广告宣传后礼品 付款   首先客户付款给代理商  或者 付款给厂家  广告宣传后礼品");
	}

}


