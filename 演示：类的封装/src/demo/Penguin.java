package demo;

/**
 * 宠物企鹅类
 * @author 10947
 *
 */
public class Penguin {

	private String name = "无名氏";   //昵称、默认值是“无名氏”
	private int health = 100;    //健康值，默认值100
	private int love = 0;        //亲密度
	private String sex = "Q仔";    //性别
	
	
	
	
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
		if(health < 0 || health >100) {
			System.out.println("健康值应该仔0至100之间，默认值为60");
			this.health = 60;
			return;
		}
		this.health = health;
	}




	public int getLove() {
		
		return love;
	}




	public void setLove(int love) {
		if(love < 0 || love > 100) {
			System.out.println("亲密度应该在0至100之间，默认值为10");
			this.love  = 10;
			return;
		}
		this.love = love;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	public Penguin() {
		
	}


	public Penguin(String name, int health, int love, String sex) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.sex = sex;
	}




	/**
	 * 输出企鹅的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name +
				",健康值是" + this.health + ",和主任的亲密度是"
				+ this.love +",性别是 " + this.sex + ".");
	}
}
