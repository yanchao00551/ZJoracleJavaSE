package com.skeyedu.mall.dao.user;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.param.UserParam;

public interface UserDao extends IBaseDao{

	User findByLoginName(String loginName) throws Exception;

	int save(User user) throws Exception;

	void update(User user) throws Exception;

	void deleteById(String id) throws Exception;

	List<User> queryUserList(UserParam userParam) throws Exception;

	User queryUserById(Integer userId) throws Exception;

	Integer queryUserCount(UserParam userParam) throws Exception;

}
