package demo;

public class Pet {
	private String name = "������";
    private int health = 100;
    private int love = 0;
    
    public Pet() {
    	this.health = 95;
    	System.out.println("ִ�г�����޲ι��췽��");
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
	 * ���������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name +
				",����ֵ��" + this.health + ",�����ε����ܶ���"
				+ this.love);
	}
}
