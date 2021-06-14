package demo;


/**
 * 宠物类，狗狗和企鹅的父类
 * 抽象类可以存在普通方法，也可以存在抽象方法
 * @author 10947
 *
 */
public abstract class Pet{
	protected String name = "无名氏";  //昵称，默认值
	protected int health = 100;  //健康值
	protected int love = 0;   //亲密度
	
	
	public abstract void eat();     //抽象方法eat(),负责宠物吃饭功能
	
	
	public Pet() {
		
	}
	
	public Pet(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getLove() {
		return love;
	}


	public void setLove(int love) {
		this.love = love;
	}


	public void print() {
		System.out.println("Pet [name=" + name + ", health=" + health + ", love=" + love + "]");
	}
	
	
	
	
}
