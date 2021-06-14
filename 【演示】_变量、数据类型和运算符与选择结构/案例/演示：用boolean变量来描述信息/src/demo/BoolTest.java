package demo;

import java.util.Scanner;

public class BoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liSi = 80;     //李四的成绩
		boolean isBig;     //声明一个boolean类型的变量
		Scanner input = new Scanner(System.in); //java控制台输入的一种方法
		System.out.println("输入学员张三成绩：");//提示要输入学员张三的成绩
		int zhangSan = input.nextInt();   //输入张三的成绩
		isBig = zhangSan > liSi;
		System.out.println("张三成绩比李四高吗？" + isBig); //输出比较结果
	}

}
