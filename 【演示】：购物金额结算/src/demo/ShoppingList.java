package demo;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] cashes = new double[5]; 
		double sum = 0.0;    //�ܽ��
		System.out.println("�������Ա���µ����Ѽ�¼");
		Scanner input = new Scanner(System.in);
		//ѭ��������
		for(int i=0; i<cashes.length; i++) {
			System.out.print("�������" + (i+1) + "�ʹ����");
			cashes[i] = input.nextDouble();
			sum = sum + cashes[i];      //�ۼ��ܽ��
		}
		
		//ѭ�����ÿ�ʽ��
		System.out.println("\n���\t\t���(Ԫ)");
		for(int i=0; i <cashes.length; i++) {
			System.out.println((i+1) + "\t\t" + cashes[i]);
		}
		
		System.out.println("�ܽ��\t\t" + sum);
	}

}
