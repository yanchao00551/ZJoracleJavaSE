package demo;


/**
 * �����࣬���������ĸ���
 * ��������Դ�����ͨ������Ҳ���Դ��ڳ��󷽷�
 * @author 10947
 *
 */
public abstract class Pet{
	protected String name = "������";  //�ǳƣ�Ĭ��ֵ
	protected int health = 100;  //����ֵ
	protected int love = 0;   //���ܶ�
	
	
	public abstract void eat();     //���󷽷�eat(),�������Է�����
	
	
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
