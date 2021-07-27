package com.demo.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.demo.entity.User;


/**
 * 配置类、
 * @author 10947
 *
 */
public final class Properties {
	//统计年龄表头线
	public final static String LINE_AGE;
	//用户列表表头线
	public final static String LINE;
	public final static String[] AGELEVEL;
	public final static String[] PERSON_INFO;
	
	
	/**
	 * 用户列表容器
	 */
	public static List<User> userList = new LinkedList<>();
	
	/**
	 * 用户年龄统计Map容器
	 */
	public static Map<String,Integer> userAgeSumMap = new LinkedHashMap<>();
	
	
	
	//静态代码块
	static {
		LINE_AGE = "----------------------------------------------------------------------------------------------------------------";
		LINE = "-------------------------------------------------";
		AGELEVEL = new String[] {"0-18（不含18)","18-20（不含20)","20-30（不含30)","30-40(不含40)","40以上"};
		PERSON_INFO = new String[] {"ID","姓名","年龄"};
		
		//TODO:初始化LinkedHashMap数据,保证了顺序
		for(int i = 0; i < AGELEVEL.length; i++) {
			userAgeSumMap.put(AGELEVEL[i], null);
		}
		
	}
	

	
	/**
	 * 打印年龄统计列表头或用户表头
	 */
	public static void printMapOrListHeader(String[] arr,String line,String infomation) {
		System.out.println(infomation);
		System.out.println(line);
		int i = 0;
		for(String s:arr) {
			System.out.print("|\t" + s +"\t");
			i++;
			if(i == arr.length) {
				System.out.print("|");
			}
		}
		System.out.println("\n"+line);
	}




	/**
	 * 初始化内容
	 */
	public static void setUserList() {
		userList.add(new User(1L,"小张",58));
		userList.add(new User(2L,"老王",28));
		userList.add(new User(3L,"李四",21));
		userList.add(new User(4L,"赵六",19));
		userList.add(new User(5L,"小李",12));
		userList.add(new User(6L,"小司",17));
		userList.add(new User(7L,"诸葛",30));
	}
	
	
	
	
}
