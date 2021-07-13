package demo;

public class Penguin extends Pet{
	private String sex;   //性别
	
	public Penguin(String name,String sex) {
		super(name);
		this.sex  =  sex;
	}
	
	
	public String getSex() {
		return sex;
	}


	/**
	 * 重写父类的print方法
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("性别是：" + this.sex  + "。");
	}

	

	/**
	 * 实现吃饭方法
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health +5;
		System.out.println("企鹅" + super.name + "吃饱啦！健康值增加5");
	}

}
