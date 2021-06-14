package demo;

public class Dog extends Pet{

	private String strain; //Ʒ��
	
	/**
	 * super�ؼ��� ���ø��෽����super.������()   ���ø����вι���:super(����...)    
	 *    ���ø����޲ι���:  super();   
	 *     ���ø������ԣ�  super.������
	 * @param name
	 * @param strain
	 */
	public Dog(String name,String strain) {
		super(name);
		this.strain = strain;
	}
	
	
	//��д�����print����
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();  //���ø����print����
		System.out.println("����һֻ��" + this.strain + "��");
	}


	/**
	 * ʵ�ֳԷ�����
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health + 3;
		System.out.println("����" + super.name + "�Ա���������ֵ����3");
	}


	public String getStrain() {
		return strain;
	} 

}
