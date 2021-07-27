package com.demo.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.demo.entity.User;
import com.demo.service.UserService;
import com.demo.util.Properties;
import com.demo.util.UserComparator;
import com.demo.vo.UserVO;

/**
 * 用户业务逻辑
 * 
 * @author 10947
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public void initData() {
		// TODO Auto-generated method stub
		Properties.setUserList();
	}

	@Override
	public void sort(int type, List<User> userList) {
		// TODO Auto-generated method stub
		// 创建和集合一样的数组
		User[] users = new User[userList.size()];
		for (int i = 0; i < userList.size(); i++) {
			users[i] = userList.get(i);
		}
		Arrays.sort(users, new UserComparator(type));
		
		
		//打印用户列表头
		Properties.printMapOrListHeader(Properties.PERSON_INFO,Properties.LINE,"排序List数据：");
		//输出数组内容
		for(int j = 0; j < users.length; j++) {
			System.out.print("|\t"+users[j].getId()+"\t|\t" + users[j].getName() +"\t|\t" + users[j].getAge() +"\t|\n");
			System.out.println(Properties.LINE);
		}
	}

	@Override
	public void sumAge() {
		// TODO Auto-generated method stub
		//取出Map中所有的值
		
		int sum = 0;
		for(User obj:Properties.userList) {
			sum += obj.getAge();
		}
		System.out.println("年龄总和：" + sum);
	}
	
	@Override
	public void print(List<User> userList) {
		// TODO Auto-generated method stub
		//打印用户列表头
		Properties.printMapOrListHeader(Properties.PERSON_INFO,Properties.LINE,"初始化List内部数据：");
		
		
		//TODO:使用VO层控制显示
		List<UserVO> userVo  = new LinkedList<>();
		for(User lst:userList) {
			userVo.add(new UserVO(lst));
		}
		
		
		//输出list内容
		for(UserVO l:userVo) {
			System.out.print("|\t"+l.getId()+"\t|\t" + l.getName() +"\t|\t" + l.getAge() +"\t|\n");
			System.out.println(Properties.LINE);
		}
	}

	@Override
	public void print(Map<String, Integer> m) {
		// TODO Auto-generated method stub
		//打印统计列表头
		Properties.printMapOrListHeader(Properties.AGELEVEL,Properties.LINE_AGE,"人数统计如下：");
		
		//遍历输出map的值、只存在1行
		Collection<Integer> collect = m.values();
		Iterator<Integer> itr = collect.iterator();
		int i = 0;
		while(itr.hasNext()) {
			Integer n = itr.next();
			
			if(i == collect.size() - 1) {
				System.out.println("|\t" + n +"\t|");
			}else {
				System.out.print("|\t" + n + "\t\t");
			}
			i++;
		}
		System.out.println(Properties.LINE_AGE);
	}

	@Override
	public void statisticStageNum() {
		// TODO Auto-generated method stub
		//引用赋值
		Map<String,Integer> imap =  Properties.userAgeSumMap;
		List<User> l = Properties.userList;
		int i1=0,i2=0,i3=0,i4=0,i5=0;
		for(int i = 0; i < l.size(); i++) {
			if(l.get(i).getAge() > 0 && l.get(i).getAge() < 18) {
				imap.put(Properties.AGELEVEL[0], ++i1);
			}else if(l.get(i).getAge() >= 18 && l.get(i).getAge() < 20) {
				imap.put(Properties.AGELEVEL[1], ++i2);
			}else if(l.get(i).getAge() >= 20 && l.get(i).getAge() < 30) {
				imap.put(Properties.AGELEVEL[2], ++i3);
			}else if(l.get(i).getAge() >= 30 && l.get(i).getAge() < 40) {
				imap.put(Properties.AGELEVEL[3], ++i4);
			}else {
				imap.put(Properties.AGELEVEL[4], ++i5);
			}
		}
	}
	
	
	@SuppressWarnings("unused")
	private Map<String, Object> Obj2Map(Object obj) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			map.put(field.getName(), field.get(obj));
		}
		return map;
	}
	
	@SuppressWarnings("unused")
	private Object map2Obj(Map<String, Object> map, Class<?> clz) throws Exception {
		Object obj = clz.newInstance();
		Field[] declaredFields = obj.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			int mod = field.getModifiers();
			if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
				continue;
			}
			field.setAccessible(true);
			field.set(obj, map.get(field.getName()));
		}
		return obj;
	}

}
