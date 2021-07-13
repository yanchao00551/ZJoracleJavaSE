package proxy;


public class ProxySubject extends Subject{  //代理角色（代理商）
	
	private RealSubject realSubject;   //以真实角色作为代理角色的属性

	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();  //前置处理
		
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();  //此处执行真实对象的request方法
		
		postRequest();  //后置处理
	}

	private void postRequest() {
		// TODO Auto-generated method stub
		System.out.println("广告宣传，免费品尝！");
	}

	private void preRequest() {
		// TODO Auto-generated method stub
		System.out.println("付款购买");
	}
	
}