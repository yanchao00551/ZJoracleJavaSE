package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.entity.User;

/**
 * 用户的业务逻辑，含有用户相关的处理方法、如排序、人数统计
 * @author 10947
 *
 */
public interface UserService {
	
	/**
	 * 数据初始化List
	 */
	void initData();
	
	
	
	/**
	 * List打印接口
	 * @param obj
	 */
	void print(List<User> userList);
	
	
	/**
	 * Map打印
	 * @param m
	 */
	void print(Map<String,Integer> m);
	
	
	
	/**
	 * 排序
	 * @param type  1、升序  2、降序
	 * @param list  需要排序的集合
	 */
	void sort(int type,List<User> list);
	
	
	/**
	 * 统计年龄
	 */
	void sumAge();
	
	
	
	/**
	 * 统计不同年龄阶段人数个数
	 */
	void statisticStageNum();
	
	
}
