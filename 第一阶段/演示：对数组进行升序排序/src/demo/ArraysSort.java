package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];  //�ɼ�����
		Scanner input = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ���");
		//ѭ��¼��ѧԱ�ɼ�
		for(int i=0; i <scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		Arrays.sort(scores);   //�����������������
		System.out.println("ѧԱ�ɼ����������У�");
		/*����ѭ�����ѧԱ�ɼ�*/
		
		for(int i = 0; i< scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
	}

}
