package demo;

class ComputerBook extends Book{
	int info = 100;  //属性名称与父类相同
	
	public void print() {
		System.out.println(info);  // 100
		System.out.println(super.info);    //Hello World!
	}
	
}
