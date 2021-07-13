package demo;

public class Pet {
	private String name = "无名氏";
    private int health = 100;
    private int love = 0;
    
    public Pet() {
    	this.health = 95;
    	System.out.println("执行宠物的无参构造方法");
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
    
    
	/**
	 * 输出狗的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name +
				",健康值是" + this.health + ",和主任的亲密度是"
				+ this.love);
	}
}
