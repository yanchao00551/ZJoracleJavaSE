package demo;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] cashes = new double[5]; 
		double sum = 0.0;    //总金额
		System.out.println("请输入会员本月的消费记录");
		Scanner input = new Scanner(System.in);
		//循环输入金额
		for(int i=0; i<cashes.length; i++) {
			System.out.print("请输入第" + (i+1) + "笔购物金额：");
			cashes[i] = input.nextDouble();
			sum = sum + cashes[i];      //累加总金额
		}
		
		//循环输出每笔金额
		System.out.println("\n序号\t\t金额(元)");
		for(int i=0; i <cashes.length; i++) {
			System.out.println((i+1) + "\t\t" + cashes[i]);
		}
		
		System.out.println("总金额\t\t" + sum);
	}

}
