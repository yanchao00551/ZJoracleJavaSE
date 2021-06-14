package demo;

class X extends C implements A,B{
    //先继承后实现
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println(INFO);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("你好");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("你好！JAVA");
	}

}
