package demo;

/**
 * ���������
 * @author 10947
 *
 */
public class Penguin {

	String name = "������";   //�ǳơ�Ĭ��ֵ�ǡ������ϡ�
	int health = 100;    //����ֵ��Ĭ��ֵ100
	int love = 0;        //���ܶ�
	
	static final String SEX_MALE = "Q��";
	static final String SEX_FEMALE = "Q��";
	String sex = SEX_MALE;   //�Ա�
	
	
	static {
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
