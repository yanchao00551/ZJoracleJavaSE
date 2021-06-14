package org.news.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.news.dao.NewUserDao;
import org.news.dao.impl.NewUserDaoImpl;
import org.news.entity.NewsUser;

public class NewsService {
	
	
	/**
	 * 分页列表
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public Map<String,Object> queryNewsList(int page, int pageSize){
		NewUserDao newUserDao = new NewUserDaoImpl();
		int limit = (page - 1) * pageSize;
		Map<String,Object> map = new HashMap<>();
		map = newUserDao.queryPage(limit, pageSize);
		return map;
	}
}
