package demo;

//一个子类同时实现了两个接口A，B
class X implements A,B{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("你好！");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(INFO);
	}  

}
