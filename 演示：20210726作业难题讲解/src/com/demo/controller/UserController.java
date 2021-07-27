package com.demo.controller;

import com.demo.service.UserService;
import com.demo.util.Factory;
import com.demo.util.Properties;

public class UserController {
	
	private UserService userService;
	
	
	//代码块,使用工厂设计模式
	{
		userService = Factory.getInstance("userService");
	}
	
	/**
	 * 学习作业需求控制器
	 */
	public void studyOn() {
		//第一步：初始化数据
		userService.initData();
		//第二步：打印List初始化数据
		userService.print(Properties.userList);
		//第三步：计算输出年龄总和
		userService.sumAge();
		//第四步：升序并输出
		userService.sort(1, Properties.userList);
		//第五步：统计年龄个数并输出统计结果
		userService.statisticStageNum();
		userService.print(Properties.userAgeSumMap);
	}

	
}
