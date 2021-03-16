package demo;

import java.util.Scanner;

public class ConsumeSavePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入消费金额：");
		double money = input.nextDouble();
		double extra = 0;     //换购付款金额
		int choice = 0;  //换购项目
		if(money >= 50) {
			System.out.println("是否参加优惠换购活动：");
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2：满100元，加3元换购500ml可乐1瓶");
			System.out.println("3：满100元，加10换购5㎏面粉");
			System.out.println("4：满200元，加10元换购苏泊尔炒菜锅");
			System.out.println("5：满200元，加20元换购欧莱雅爽肤水1瓶");
			System.out.println("0：不换购");
			System.out.println("请选择：");
			if(input.hasNextInt() == true) {
				choice = input.nextInt();
				
				switch(choice) {
				case 1:
					if(money >= 50) {
						extra = 2;
					}
					break;
				case 2:
					if(money >= 100) {
						extra = 3;
					}
					break;
				case 3:
					if(money >= 100) {
						extra = 10;
					}
					break;
				case 4:
					if(money >= 200) {
						extra = 10;
					}
					break;
				case 5:
					if(money >= 200) {
						extra = 20;
					}
					break;
				default:
					break;
				}
				
				
			}else {
				System.out.println("请输入正确的数字！");
			}
		}else {
			
		}
		
		//结账
		double total = money + extra;
		System.out.println("本次消费总金额：" + total);
		if(choice == 1 && money >= 50) {
			System.out.println("成功换购：" + "换购百事可乐饮料1瓶");
		}else if(choice == 2 && money >= 100) {
			System.out.println("成功换购：" + "换购500ml可乐1瓶");
		}else if(choice == 3 && money >= 100) {
			System.out.println("成功换购：" + "5㎏面粉");
		}else if(choice == 4 && money >= 200) {
			System.out.println("成功换购：" + "苏泊尔炒菜锅");			
		}else if(choice == 5 && money >= 200) {
			System.out.println("成功换购：" + "欧莱雅爽肤水1瓶");
		}else {
			System.out.println("无换购任何项目！");
		}
		
	}

}
