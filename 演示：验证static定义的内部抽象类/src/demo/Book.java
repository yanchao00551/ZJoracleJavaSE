package demo;

abstract class Book {
	public abstract void print();   //抽象方法
	
	static abstract class CD{    //静态内部抽象类
		public abstract void get();   //抽象方法
	}
	
}
