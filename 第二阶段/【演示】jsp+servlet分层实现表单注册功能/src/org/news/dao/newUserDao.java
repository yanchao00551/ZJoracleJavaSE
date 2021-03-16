package org.news.dao;

import org.news.entity.NewsUser;

public interface NewUserDao {
	
	//查找用户
	public int findUser(NewsUser newUser);
	
	//注册用户
	public int insert(NewsUser newsUser);
	

}
