package demo;

public class Master {
	private String name = "";// ��������
	private int money = 0; // Ԫ����
	/**
	 * �вι��췽����
	 * @param name ��������
	 * @param money Ԫ����
	 */
	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	/**
	 * ���˸�����ιʳ��
	 */
	public void feed(Pet pet) {
		pet.eat();
	}
}
