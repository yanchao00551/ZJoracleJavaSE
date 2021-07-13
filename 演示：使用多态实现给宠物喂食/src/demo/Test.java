package demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("欧欧", "雪娜瑞");
		Penguin pgn = new Penguin("楠楠", "Q妹");
		Cat cat=new Cat("Tomcat","黄色");
		dog.setHealth(80); //设置健康值，以便正常喂食
		pgn.setHealth(80); //设置健康值，以便正常喂食
		cat.setHealth(80); //设置健康值，以便正常喂食
		Master master=new Master("王先生",100);
		master.feed(dog);//主人给狗狗喂食
		master.feed(pgn);//主人给企鹅喂食
		master.feed(cat);//主人给猫喂食
	}

}
