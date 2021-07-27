package com.demo.util;

import java.util.Comparator;

import com.demo.entity.User;

/**
 * 自己额外建立、比较规则类，实现了Comparator接口，覆写compare方法
 * 
 * @author 10947
 *
 */
public class UserComparator implements Comparator<User> {
	
	private Integer type;
	
	
	public UserComparator() {
		
	}
	
	public UserComparator(Integer type) {
		this.type = type;
	}

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		
		// TODO:升序
		if (type == 1) {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else if (o1.getAge() < o2.getAge()) {
				return -1;
			} else {
				return 0;
			}
		}

		// TODO:降序
		if (type == 2) {
			if (o1.getAge() < o2.getAge()) {
				return 1;
			} else if (o1.getAge() > o2.getAge()) {
				return -1;
			} else {
				return 0;
			}
		}
		
		return 0;
	}

}
