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
			//1  ����ǹ�����ѡ�񹷵�Ʒ��
			System.out.print("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ"
					+ " 2������ѩ����)");
			String strain = null;
			if(input.nextInt() == 1) {
				strain = "��������������Ȯ";
			}else {
				strain = "����ѩ����";
			}
			//�����������󲢸�ֵ
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			//���������Ϣ
			dog.print();
			break;
		case 2:
			//2 �������죬ѡ������Ա�
			System.out.print("��ѡ�������Ա𣺣�1��Q��"
					+ " 2��Q��)");
			String sex = null;
			if(input.nextInt() == 1) {
				sex = "Q��";
			}else {
				sex = "Q��";
			}
			//���������󲢸�ֵ
			Penguin pgn = new Penguin();
			pgn.name = name;
			pgn.sex = sex;
			//���������Ϣ
			pgn.print();
			break;
		}
	}

}
