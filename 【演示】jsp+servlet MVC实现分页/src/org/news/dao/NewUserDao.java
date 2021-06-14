package org.news.dao;

import java.util.List;
import java.util.Map;

import org.news.entity.NewsUser;

public interface NewUserDao {
	
	//查找用户
	public int findUser(NewsUser newUser);
	
	//注册用户
	public int insert(NewsUser newsUser);
	
	
	//列表分页
	public Map<String, Object> queryPage(int limit,int pageSize);
	

}
