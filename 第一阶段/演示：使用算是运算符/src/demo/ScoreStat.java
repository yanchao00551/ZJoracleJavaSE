package demo;

import java.util.Scanner;

public class ScoreStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //input是一个Scanner对象，同时也是一个变量
		System.out.println("STB的成绩是：");
		int stb = input.nextInt();   //stb分数
		
		System.out.println("Java的成绩是：");
		int java = input.nextInt();   //java分数
		
		System.out.println("SQL的成绩是：");
		int sql = input.nextInt();   //java分数
		
		int diffen;    //分数差
		double avg;    //平均分
		diffen = java - sql;     //计算Java课和SQL课的成绩差
		System.out.println("计算Java课和SQL课的成绩差: " + diffen);
		avg = (stb + java + sql) / 3;  //计算平均分
		System.out.println("3门课的平均分是： " + avg);
		
		//取模运算、取余
		int d = 46;
		d++;   //  d = d + 1
		System.out.println("d++ 之后 d的值：" + d);
		int w = d % 7;
		System.out.println("d % 7 = " + w);
		
		
		
	}

}
