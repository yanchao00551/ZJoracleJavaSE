package demo;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		int[] list = new int[6];    //����Ϊ6������
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		int index = list.length;   //���������ɼ�����λ�� 6
		
		
		System.out.println("�����������ɼ���");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();  //����Ҫ�����λ��
		
	    //�ҵ�Ԫ�صĲ���λ��
		for(int i=0; i< list.length; i++) {
			if(num > list[i]) {
				index = i;
				break;
			}
		}
		
		//Ԫ�غ���
		for(int j = list.length -1 ; j> index; j--) {
			list[j] = list[j-1];
		}
		
		list[index] = num;   //����Ԫ��
		
		
		System.out.println("����ɼ����±��ǣ�" + index);
		
		System.out.println("��������Ϣ�ǣ�");
		
		
		for(int k = 0; k < list.length; k++) {
			System.out.println(list[k] + "\t");
		}
	}
}
