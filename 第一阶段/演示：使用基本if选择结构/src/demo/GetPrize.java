package demo;

import java.util.Scanner;

public class GetPrize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入张三的Java成绩：");  //提示输入java成绩
		int score = input.nextInt();//从控制台获取张三的java成绩
		if(score > 90) {  //判断是否大于90分
			System.out.println("不错有奖励！");
		}
	}

}
