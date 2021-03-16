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
	 * 用户输入 采集数组b
	 */
	public static int[] inputArr() {
		int[] b = new int[Config.NUMBER];
		System.out.print("数组a:[");
		for(int i=0; i< Config.A.length; i++) {
			System.out.print(Config.A[i]);
			if(i != Config.A.length - 1)  //最后一个不加,
				System.out.print(", ");
		}
		System.out.println("]");
		
		for(int i = 0; i < Config.NUMBER; i++) {
			System.out.println("请输入长度为" + Config.NUMBER + "的数组 " + i + "下标数组b内容：");
			b[i] = input.nextInt();
		}
		
		return b;
	}
	
	/*
	 * 用户下标录入
	 */
	public static int inputIndex() {
		int i = 0;
		do {
			System.out.println("请输入插入到数组a的位置：");
			i = input.nextInt();	
		}while(i > 8 || i < 0);	
		return i;
	}
}
