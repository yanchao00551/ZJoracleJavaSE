package demo;

public class Cat extends Pet{
	private String color;//��ɫ
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
	 *  ʵ�ֳԷ����� 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("����"+this.getName() +"�Ա��ˣ�����Ҫιʳ�ˣ�");
		}else{
			this.setHealth(this.getHealth()+4);
			System.out.println("è��"+this.getName() + "�Ա�������������4��");
		}
	}
}
