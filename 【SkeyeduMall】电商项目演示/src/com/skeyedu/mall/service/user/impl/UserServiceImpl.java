package com.skeyedu.mall.service.user.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.skeyedu.mall.dao.user.UserDao;
import com.skeyedu.mall.dao.user.UserDaoImpl;
import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.param.UserParam;
import com.skeyedu.mall.service.user.UserService;
import com.skeyedu.mall.utils.DataSourceUtil;

public class UserServiceImpl implements UserService{
	
	
	
	    //根据ID查询用户信息
	    public User findByLoginName(String loginName) {
			Connection connection = null;
			User user = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				user = userDao.findByLoginName(loginName);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
			return user;
		}

		public boolean save(User user) {//新增用户信息
			boolean flag=false;
			Connection connection = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				int count=userDao.save(user);
				flag=count>0;
			} catch (SQLException e) {
				flag=false;
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
				return flag;	
			}
		}

		public void update(User user) {//更新用户信息
			Connection connection = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				userDao.update(user);
			} catch (Exception e) {			
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
		}

		public void delete(String id) {//根据ID删除用户
			Connection connection = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				userDao.deleteById(id);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
		}

		@Override
		public List<User> queryUserList(UserParam userParam) {
			Connection connection = null;
			List<User> userList = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				userList = userDao.queryUserList(userParam);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
			return userList;
		}

		@Override
		public int queryUserCount(UserParam userParam) {
			Connection connection = null;
			int count=0;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				count = userDao.queryUserCount(userParam);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
			return count;
		}

		@Override
		public User queryUserById(Integer userId) {
			Connection connection = null;
			User user = null;
			try {
				connection = DataSourceUtil.openConnection();
				UserDao userDao = new UserDaoImpl(connection);
				user = (User) userDao.queryUserById(userId);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DataSourceUtil.closeConnection(connection);
			}
			return user;
		}
}
