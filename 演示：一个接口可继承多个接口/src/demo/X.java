package demo;

class X extends C implements D{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(INFO);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("你好");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("抽象类C实现接口A，B");
	}

	@Override
	public void printD() {
		// TODO Auto-generated method stub
		System.out.println("接口D继承两个接口A，B");
	}

}
