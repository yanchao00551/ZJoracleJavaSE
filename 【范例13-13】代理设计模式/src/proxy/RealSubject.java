package proxy;


public class RealSubject extends Subject{  //真实角色 （红酒厂商)

	@Override
	public void request() {                 //实现抽象方法
		// TODO Auto-generated method stub
		System.out.println("我是红酒厂商，欢迎品尝购买");
	}
	
}