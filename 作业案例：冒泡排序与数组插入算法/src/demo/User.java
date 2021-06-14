package demo;

import java.util.Scanner;

/*
 * 用户操作类
 */
public class User {
	
	/*
	 * 设置键盘输入成员对象
	 */
	public static final Scanner input = new Scanner(System.in);
	
	
	
	/*
	 * 用户 数组b 数据采集
	 */
	public static int[] inputArr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("数组a:[");
		for(int i=0; i< Config.NUMBER; i++) {
			System.out.print(Config.A[i]);
			if(i != Config.NUMBER - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		for(int i=0; i< Config.NUMBER; i++) {
			System.out.println("请输入长度为" + Config.NUMBER + "的数组 " +i+"下标数组b内容：");
			b[i] = input.nextInt();
		}
		return b;
	}
	
	
	/*
	 * 递归验证，用户下标录入
	 */
	public static int inputIndex() {
		System.out.println("请输入插入到数组a的位置：");
		int i = input.nextInt();
		if(i <0 && i >= 8)
			inputIndex();
		return i;
	}
}
