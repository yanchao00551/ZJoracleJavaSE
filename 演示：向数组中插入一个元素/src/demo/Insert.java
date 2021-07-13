package demo;

import java.util.Scanner;

public class Insert {
	public static void main(String[] args) {
		int[] list = new int[6];    //长度为6的数组
		list[0] = 99;
		list[1] = 85;
		list[2] = 82;
		list[3] = 63;
		list[4] = 60;
		int index = list.length;   //保存新增成绩插入位置 6
		
		
		System.out.println("请输入新增成绩：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();  //输入要插入的位置
		
	    //找到元素的插入位置
		for(int i=0; i< list.length; i++) {
			if(num > list[i]) {
				index = i;
				break;
			}
		}
		
		//元素后移
		for(int j = list.length -1 ; j> index; j--) {
			list[j] = list[j-1];
		}
		
		list[index] = num;   //插入元素
		
		
		System.out.println("插入成绩的下标是：" + index);
		
		System.out.println("插入后的信息是：");
		
		
		for(int k = 0; k < list.length; k++) {
			System.out.println(list[k] + "\t");
		}
	}
}
