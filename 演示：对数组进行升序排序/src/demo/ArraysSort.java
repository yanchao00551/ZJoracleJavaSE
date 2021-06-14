package demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[5];  //成绩数组
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位学员的成绩：");
		//循环录入学员成绩
		for(int i=0; i <scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		Arrays.sort(scores);   //对数组进行升序排序
		System.out.println("学员成绩按升序排列：");
		/*利用循环输出学员成绩*/
		
		for(int i = 0; i< scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
	}

}
