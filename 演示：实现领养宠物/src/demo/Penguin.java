package demo;

/**
 * 宠物企鹅类
 * @author 10947
 *
 */
public class Penguin {

	String name = "无名氏";   //昵称、默认值是“无名氏”
	int health = 100;    //健康值，默认值100
	int love = 0;        //亲密度
	String sex = "Q仔";    //性别
	
	
	/**
	 * 输出企鹅的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name +
				",健康值是" + this.health + ",和主任的亲密度是"
				+ this.love +",性别是 " + this.sex + ".");
	}
}
