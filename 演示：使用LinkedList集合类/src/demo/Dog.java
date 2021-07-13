package demo;

public class Dog extends Pet{

	private String strain; //品种
	
	/**
	 * super关键字 调用父类方法：super.方法名()   调用父类有参构造:super(参数...)    
	 *    调用父类无参构造:  super();   
	 *     调用父类属性：  super.属性名
	 * @param name
	 * @param strain
	 */
	public Dog(String name,String strain) {
		super(name);
		this.strain = strain;
	}
	
	
	//覆写父类的print方法
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();  //调用父类的print方法
		System.out.println("我是一只：" + this.strain + "。");
	}


	/**
	 * 实现吃饭方法
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health + 3;
		System.out.println("狗狗" + super.name + "吃饱啦！健康值增加3");
	}


	public String getStrain() {
		return strain;
	} 

}
