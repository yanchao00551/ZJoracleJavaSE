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
	 * �û����� �ɼ�����b
	 */
	public static int[] inputArr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("����a:[");
		for(int i=0; i< Config.A.length; i++) {
			System.out.print(Config.A[i]);
			if(i != Config.A.length - 1)  //���һ������,
				System.out.print(", ");
		}
		System.out.println("]");
		
		for(int i = 0; i < Config.NUMBER; i++) {
			System.out.println("�����볤��Ϊ" + Config.NUMBER + "������ " + i + "�±�����b���ݣ�");
			b[i] = input.nextInt();
		}
		
		return b;
	}
	
	/*
	 * �û��±�¼��
	 */
	public static int inputIndex() {
		int i = 0;
		do {
			System.out.println("��������뵽����a��λ�ã�");
			i = input.nextInt();	
		}while(i > 8 || i < 0);	
		return i;
	}
}
