package demo;


/**
 * ������ר��������
 * @author 10947
 *
 */
public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 0;// ���ܶ�
	
	/**
	 * ���󷽷�eat(),�������Է����ܡ�
	 */
	public abstract void eat();
	
	/**
	 * �вι��췽����
	 * @param name  �ǳ�
	 */
	public Pet(){
		
	}
	
	public Pet(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "��");
	}
}
