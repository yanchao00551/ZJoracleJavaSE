package demo;

/**
 * ���������
 * @author 10947
 *
 */
public class Penguin {

	private String name = "������";   //�ǳơ�Ĭ��ֵ�ǡ������ϡ�
	private int health = 100;    //����ֵ��Ĭ��ֵ100
	private int love = 0;        //���ܶ�
	private String sex = "Q��";    //�Ա�
	
	
	
	
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
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60");
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
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��ֵΪ10");
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
	 * ���������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name +
				",����ֵ��" + this.health + ",�����ε����ܶ���"
				+ this.love +",�Ա��� " + this.sex + ".");
	}
}
