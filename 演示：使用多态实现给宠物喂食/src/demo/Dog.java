package demo;

public class Dog extends Pet{
	private String strain;// 品种
	/**
	 * 有参构造方法。
	 * @param name   昵称
	 * @param strain   品种
	 */
	public Dog(String name, String strain) {
		super(name); 
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	/**
	 * 重写父类的print方法。
	 */
	public void print(){
		super.print(); //调用父类的print方法
		System.out.println("我是一只 " + this.strain + "。");
	}
	
	/**
	 * 实现吃食方法。 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("狗狗"+this.getName() +"吃饱了，不需要喂食了！");
		}else{
			this.setHealth(this.getHealth()+3);
			System.out.println("狗狗"+this.getName() + "吃饱啦！健康值增加3。");
		}
	}
}
