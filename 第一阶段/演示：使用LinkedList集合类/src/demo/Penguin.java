package demo;

public class Penguin extends Pet{
	private String sex;   //�Ա�
	
	public Penguin(String name,String sex) {
		super(name);
		this.sex  =  sex;
	}
	
	
	public String getSex() {
		return sex;
	}


	/**
	 * ��д�����print����
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("�Ա��ǣ�" + this.sex  + "��");
	}

	

	/**
	 * ʵ�ֳԷ�����
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health +5;
		System.out.println("���" + super.name + "�Ա���������ֵ����5");
	}

}
