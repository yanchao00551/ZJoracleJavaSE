package demo;

public class Dog extends Pet{
	private String strain;// Ʒ��
	/**
	 * �вι��췽����
	 * @param name   �ǳ�
	 * @param strain   Ʒ��
	 */
	public Dog(String name, String strain) {
		super(name); 
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	/**
	 * ��д�����print������
	 */
	public void print(){
		super.print(); //���ø����print����
		System.out.println("����һֻ " + this.strain + "��");
	}
	
	/**
	 * ʵ�ֳ�ʳ������ 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("����"+this.getName() +"�Ա��ˣ�����Ҫιʳ�ˣ�");
		}else{
			this.setHealth(this.getHealth()+3);
			System.out.println("����"+this.getName() + "�Ա���������ֵ����3��");
		}
	}
}
