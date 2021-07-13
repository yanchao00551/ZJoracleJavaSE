package demo;

import java.util.Scanner;

public class AvgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];  //成绩数组
		
	
		int sum = 0;  //成绩总和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i=0; i< scores.length; i++) {
			scores[i] = input.nextInt();
			sum = sum + scores[i];   //成绩累加
			//  sum += scores[i];   
		}
		
		System.out.println("平均分：" + (double)sum/scores.length);
	}

}
