package com.demo;

import java.util.Random;
/**
 * 对象数组的新增删除操作与排序
 * @author 10947
 *
 */
public class ArraySort {
	/**
	 * 定义数组
	 */
	private static Student[] arr = new Student[25];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//初始化数组
		init(arr);
		
		//插入
		insert(3,new Student(21,3,79));
		
		//删除
		delete(5);
	}
	
	
	/**
	 * 初始化数组
	 * @param arr
	 */
	private static void init(Student[] arr1) {
		for(int i = 0; i < arr1.length - 5; i++) {
			arr1[i] = new Student(i+1,new Random().nextInt(5),new Random().nextInt(100));
		}
		System.out.println("------ 初始化后的数据------");
		print(arr1);
		
		//排序 升序
		sort(arr1,1);
		System.out.println("------ 升序排序后的数据------");
		print(arr1);
	}


	/**
	 * 冒泡排序
	 * @param arr1
	 * @param type 1 升序  2 降序
	 */
	private static void sort(Student[] arr1,int type) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr1.length - 1 - 5; i++) {
			for(int j = 0; j < arr1.length - 1 - i - 5; j++) {
				//升序
				if(arr1[j].getScore() > arr1[j + 1].getScore() && type == 1) {
					Student temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
				//降序
				if(arr1[j].getScore() < arr1[j + 1].getScore() && type == 2) {
					Student temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
	}
	
	/**
	 * 打印数组
	 * @param arr2
	 */
	private static void print(Student[] arr2) {
		int i = 0;
		for(Student s:arr2) {
			System.out.println("arr[" + i + "] = " + s);
			i++;
		}
	}
	
	/**
	 * 删除指定下标的值
	 * @param i
	 */
	private static void delete(int index) {
		// TODO Auto-generated method stub
		//不需要移动位置的情况
		if(index == arr.length - 1) {
			arr[index] = null;
		}
		
		if(index >= 0 && index < arr.length - 1) {
			//向上移动位置
			for(int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = null;
 		}
		
		System.out.println("-------删除之后升序后的数据----------");
		sort(arr,1);
		print(arr);
	}

	
	/**
	 * 数组插入：在index下标之前插入value
	 * @param index
	 * @param value
	 */
	private static void insert(int index,Student value) {
		//TODO: 插入逻辑
		
		if(index >= 0 && index < arr.length) {
			//数据移位，index开始后移位置
			for(int i = arr.length - 1; i > index; i--) {
				arr[i] = arr[i - 1];
			}
			arr[index] = value;
		}
		System.out.println("-------插入成功后的数据------");
		print(arr);
		
		
		//TODO:插入之后打印数组
		System.out.println("-------插入成功后的降序数据------");
		sort(arr,2);
		print(arr);
	}
}
