package demo;

import java.util.Scanner;

/*
 * �û�������
 */
public class User {
	
	/*
	 * ���ü��������Ա����
	 */
	public static final Scanner input = new Scanner(System.in);
	
	
	
	/*
	 * �û� ����b ���ݲɼ�
	 */
	public static int[] inputArr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("����a:[");
		for(int i=0; i< Config.NUMBER; i++) {
			System.out.print(Config.A[i]);
			if(i != Config.NUMBER - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		for(int i=0; i< Config.NUMBER; i++) {
			System.out.println("�����볤��Ϊ" + Config.NUMBER + "������ " +i+"�±�����b���ݣ�");
			b[i] = input.nextInt();
		}
		return b;
	}
	
	
	/*
	 * �ݹ���֤���û��±�¼��
	 */
	public static int inputIndex() {
		System.out.println("��������뵽����a��λ�ã�");
		int i = input.nextInt();
		if(i <0 && i >= 8)
			inputIndex();
		return i;
	}
}
