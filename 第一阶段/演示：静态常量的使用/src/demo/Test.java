package demo;

/**
 * ��̬������ʹ��
 * @author 10947
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin pgn = null;
		pgn = new Penguin();
		System.out.println("��һ�������Ա��ǣ�" + pgn.sex + ".");
		
		pgn = new Penguin();
		pgn.sex = Penguin.SEX_FEMALE;
		System.out.println("�ڶ��������Ա��ǣ�" + pgn.sex + ".");
		
		
		pgn = new Penguin();
		pgn.sex = Penguin.SEX_MALE;
		System.out.println("�����������Ա��ǣ�" + pgn.sex + ".");
		
		
	}

}
