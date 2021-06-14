package demo;

import java.util.Scanner;

/**
 * 领养宠物
 * @author 10947
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物店！");
		//1、输入宠物的名字
		System.out.print("请输入要领养宠物的名字：");
		String name = input.next();
		//2、选择宠物类型
		System.out.print("请选择要领养的宠物类型：(1、狗狗 2、企鹅)");
		switch(input.nextInt()) {
		case 1:
			//省略
			break;
		case 2:
			//2 如果是企鹅，选择企鹅性别
			System.out.print("请选择企鹅的性别：（1、Q仔"
					+ " 2、Q妹)");
			String sex = null;
			if(input.nextInt() == 1) 
				sex = "Q仔";
			System.out.print("请输入企鹅的健康值（1~100之间）：");
			int health = input.nextInt();
			//创建企鹅对象并赋值
			Penguin pgn = new Penguin();
			pgn.setName(name);
			pgn.setSex(sex);
			pgn.setHealth(health);
			//输出企鹅的信息
			pgn.print();
			break;
		}
	}

}
