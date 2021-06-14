package demo;

import java.util.Scanner;

public class AvgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];    //成绩数组 
        
		//创建数组并赋值的方式必须在一条语句中完成
		
		int sum = 0;                  //成绩总和
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
			sum += scores[i];  //成绩累加
		}
		//计算平均分并输出
		System.out.println("学员的平均分是：" + (double)sum/scores.length);
		
	}
	
	
}
