package demo;

import java.util.Scanner;

/**
 * ��������
 * @author 10947
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ��������꣡");
		//1��������������
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		//2��ѡ���������
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ�(1������ 2�����)");
		switch(input.nextInt()) {
		case 1:
			//ʡ��
			break;
		case 2:
			//2 �������죬ѡ������Ա�
			System.out.print("��ѡ�������Ա𣺣�1��Q��"
					+ " 2��Q��)");
			String sex = null;
			if(input.nextInt() == 1) 
				sex = "Q��";
			System.out.print("���������Ľ���ֵ��1~100֮�䣩��");
			int health = input.nextInt();
			//���������󲢸�ֵ
			Penguin pgn = new Penguin();
			pgn.setName(name);
			pgn.setSex(sex);
			pgn.setHealth(health);
			//���������Ϣ
			pgn.print();
			break;
		}
	}

}
