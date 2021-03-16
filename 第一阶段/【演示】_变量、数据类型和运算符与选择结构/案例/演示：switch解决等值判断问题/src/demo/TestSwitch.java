package demo;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\t\t欢迎使用天眼当当购物管理系统1.0版\n");
		System.out.println("\t\t\t 1. 登 录 系 统\n");
		System.out.println("\t\t\t 2. 退 出\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("请选择，输入数字：");
		
		
		/* 从键盘获取信息，并执行相应操作---*/
		Scanner input = new Scanner(System.in);
		//Scanner类提供了hasNextInt() 判断是否是整数，返回boolean
		if(input.hasNextInt() == true) {
			int menuId = input.nextInt(); 
			switch(menuId) {
			case 1:
				System.out.println("menuId的值全等于 1的时候所执行的！");
				break;
			case 2:
				System.out.println("退出系统！");
				break;
			default:
				System.out.println("输入错误！");
				break;
			}
		}else {
			System.out.println("请输入正确的数字！");
		}
		
	}

}
