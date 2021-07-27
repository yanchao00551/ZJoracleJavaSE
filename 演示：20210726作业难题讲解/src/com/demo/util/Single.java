package com.demo.util;

import com.demo.controller.UserController;

/**
 * 单例类
 * @author 10947
 *
 */
public class Single {
	private static final UserController USER;
	
	
	static {
		USER = new UserController();
	}
	
	
	public static UserController getUserController() {
		return USER;
	}
	
	
	
}
