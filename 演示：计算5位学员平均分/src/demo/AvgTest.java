package demo;

import java.util.Scanner;

public class AvgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];  //�ɼ�����
		
	
		int sum = 0;  //�ɼ��ܺ�
		Scanner input = new Scanner(System.in);
		System.out.println("������5λѧԱ�ĳɼ���");
		for(int i=0; i< scores.length; i++) {
			scores[i] = input.nextInt();
			sum = sum + scores[i];   //�ɼ��ۼ�
			//  sum += scores[i];   
		}
		
		System.out.println("ƽ���֣�" + (double)sum/scores.length);
	}

}
