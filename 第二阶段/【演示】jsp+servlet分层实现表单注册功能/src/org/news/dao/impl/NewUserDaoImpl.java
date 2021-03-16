package org.news.dao.impl;

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

}
