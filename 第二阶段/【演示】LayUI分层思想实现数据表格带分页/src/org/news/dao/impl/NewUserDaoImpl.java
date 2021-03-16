package org.news.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.news.dao.BaseDao;
import org.news.dao.NewUserDao;
import org.news.entity.NewsUser;

public class NewUserDaoImpl extends BaseDao implements NewUserDao{

	private static Logger logger = Logger.getLogger(NewUserDaoImpl.class);

	
	@Override
	public int findUser(NewsUser newUser) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(NewsUser newsUser) {
		// TODO Auto-generated method stub
		int result = 0;
		
		try {
			String sql = "INSERT INTO `news_users`(`uname`,`upwd`) values(?,?)";
			logger.debug(newsUser);
			result = this.executeUpdate(sql, newsUser.getUname(),newsUser.getUpwd());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeAll(conn, null, null);
		}
		
		return result;
	}

	@Override
	public Map<String,Object> queryPage(int limit, int pageSize) {
		// TODO Auto-generated method stub
		List<NewsUser> list = new ArrayList<>();
		Map<String,Object> resultMap  = new HashMap<>();
		ResultSet result = null;
		ResultSet countResult = null;
		try {
			String sql = "SELECT * FROM news_users LIMIT ?,?";
			String countSql = "SELECT COUNT(1) as count FROM news_users";
			
		    result = this.executeQuery(sql, limit, pageSize);
			while(result.next()) {
				NewsUser newUser = new NewsUser();
				newUser.setUname(result.getString("uname"));
				newUser.setUpwd("upwd");
				list.add(newUser);
			}
		    countResult = this.executeQuery(countSql);
			Integer count = 0;
			while(countResult.next()) {
				count = countResult.getInt("count");
			}
			resultMap.put("list", list);
			resultMap.put("count", count.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			this.closeAll(conn, null, null);
		}
		
		
		return resultMap;
	}

}
