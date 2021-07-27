package com.demo;

import com.demo.controller.UserController;
import com.demo.util.Single;


/**
 * 程序入口类
 * @author 10947
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserController controller = Single.getUserController();
		//启动程序
		controller.studyOn();
	}

}
