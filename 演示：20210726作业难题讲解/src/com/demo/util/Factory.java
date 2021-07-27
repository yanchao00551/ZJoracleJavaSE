package com.demo.util;

import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;

/**
 * 工厂类-第三方
 * @author 10947
 *
 */
public class Factory {
	
	
	public static UserService getInstance(String className) {
		if("userService".equals(className)) {
			return new UserServiceImpl();
		}
		return null;
	}
}
