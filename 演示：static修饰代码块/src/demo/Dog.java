package demo;

/**
 * ���ﹷ��
 * @author 10947
 *
 */
public class Dog {
	String name = "������";   //�ǳơ�Ĭ��ֵ�ǡ������ϡ�
	int health = 100;    //����ֵ��Ĭ��ֵ100
	int love = 0;        //���ܶ�
	String strain = "��������������Ȯ";    //Ʒ��
	
	
	/**
	 * ���������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name +
				",����ֵ��" + this.health + ",�����ε����ܶ���"
				+ this.love +",����һֻ " + this.strain + ".");
	}
}
