package demo;

import java.util.Scanner;

public class MaxScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];
		int max = 0;  //��¼���ֵ
		System.out.println("������5λѧԱ�ĳɼ���");
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		//�������ֵ
		max = scores[0];
		for(int i=1; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		
		System.out.println("���Գɼ���߷�Ϊ��" + max);
	}

}
