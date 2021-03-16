package com.skeyedu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skeyedu.entity.BookEntity;
import com.skeyedu.entity.MenuEntity;
import com.skeyedu.entity.OrderEntity;
import com.skeyedu.entity.PublisherEntity;
import com.skeyedu.entity.StudentEntity;
import com.skeyedu.service.BookService;
import com.skeyedu.service.MenuService;
import com.skeyedu.service.OrderService;
import com.skeyedu.service.PublisherService;
import com.skeyedu.service.StudentService;
import com.crezyman.utils.Params;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//根据订单id查询某个订单
		MenuService m = new MenuService();
		OrderService o = new OrderService();
		StudentService s1 = new StudentService();  //student模块业务逻辑
		BookService b1 = new BookService();
		PublisherService p1 = new PublisherService();
		
		BookEntity bookEntity = b1.findById("1");
		PublisherEntity publisherEntity = p1.findById(bookEntity.getpId().toString());
		bookEntity.setPublisher(publisherEntity);
		//System.out.println(bookEntity);
    	
    	
    	
    	
	
		//新增订单
		Params p = new Params();
		Params pp = new Params();
		
		
		//用java实现了连表查询 方案1  推荐， 框架  也推荐   写代码容易 比较容易维护
		System.out.println("连表查询方案一：");
    	List<Object> listBook = b1.queryOrdersList(pp);
    	PublisherEntity publisher =null;
    	for(Object y:listBook) {
			BookEntity t = (BookEntity) y;
			publisher = p1.findById(t.getpId().toString());
			t.setPublisher(publisher);
			System.out.println(t);
		}
    	
    	//方案二 ：方法 实现连表查询，真正实现了连表查询 LEFT JOIN
    	System.out.println("LEFT JOIN连表查询方案二：");
    	List<Object> listBook1 = b1.queryBookLinkPublisherByList(pp);
    	for(Object y:listBook1) {
			BookEntity t = (BookEntity) y;
			System.out.println(t);
		}
    	
    	
		
		
		Map<String,Object> add = new HashMap<String,Object>();
		add.put("0", "订单2");
		add.put("1", "1,2,3");
		add.put("2", "11:33");
		add.put("3", "地址222");
		add.put("4", new Integer(0));
		add.put("5", new BigDecimal("88.8"));
		p.setAddParams(add);
		o.save(p);

		//构造 区间查询
		List<Object>  list= new ArrayList<Object>();
		
		
		
		
		/* 所有查询字段可配置、  灵活组合   得到查询结果 */
		
       /* 构造区间查询条件 */		
		Map<String,List<Integer>> map = new HashMap<String,List<Integer>>();
		List<Integer> between = new ArrayList<Integer>();
		between.add(0);
		between.add(50);
		map.put("sum_price", between);
		p.setBetweenParams(map);
		/* 模糊查询*/
		//p.addLike("address", "%湘潭市%");
		
		
		
		  
		
//		int currentPage = 4;  //当前页，默认第一页  可以动态改变
//		int pageSize = 6;      //每页5条
//		int limit = (currentPage - 1)  * pageSize; // 分页公式
//		p.openPager(limit, pageSize);
		
		list = o.queryOrdersList(p);
		
		for(Object y:list) {
			OrderEntity t = (OrderEntity) y;
			System.out.println(t);
		}
		

	}

}
