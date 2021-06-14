package demo;

public class Cat extends Pet{
	private String color;//颜色
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	/**
	 *  实现吃饭方法 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("狗狗"+this.getName() +"吃饱了，不需要喂食了！");
		}else{
			this.setHealth(this.getHealth()+4);
			System.out.println("猫咪"+this.getName() + "吃饱啦！体力增加4。");
		}
	}
}
