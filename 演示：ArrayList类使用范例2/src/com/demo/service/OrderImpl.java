package com.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.demo.entity.Menu;



public class OrderImpl implements IOrder{

	@Override
	public void diancan() {
		// TODO Auto-generated method stub
		List<Menu> menuList = new ArrayList<Menu>();
		Menu m1 = new Menu();
		m1.setId(1);
		m1.setName("������˿");
		m1.setPrice(28.8);
		m1.setZan(0);
		Menu m2 = new Menu();
		m2.setId(2);
		m2.setName("���մ���");
		m2.setPrice(58.8);
		m2.setZan(2);
		
		menuList.add(m1);
		menuList.add(m2);
		
		
		//�༯�����  
		Iterator<?> itr = menuList.iterator();
		while(itr.hasNext()) { //�ж��Ƿ������һ��ֵ
			Menu m = (Menu)itr.next();
			System.out.println(m);
		}
		
		//��ǿ��forѭ��
		for(Menu m:menuList) {
			System.out.println(m);
		}
		
		
		//��ͨforѭ��
		for(int i=0; i < menuList.size(); i++) {
			System.out.println(menuList.get(i));
		}
		
		
	}

}
