package com.skeyedu.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.skeyedu.entity.book.BookEntity;
import com.skeyedu.entity.menu.MenuEntity;
import com.skeyedu.entity.order.OrderEntity;
import com.skeyedu.entity.publisher.PublisherEntity;
import com.skeyedu.entity.student.StudentEntity;
import com.skeyedu.service.custom.BookService;
import com.skeyedu.service.custom.MenuService;
import com.skeyedu.service.custom.OrderService;
import com.skeyedu.service.custom.PublisherService;
import com.skeyedu.service.custom.StudentService;
import com.skeyedu.utils.Params;


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
    	
    	
		
		

		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setAddress("地址8888");
		orderEntity.setDishMegs("1,2,3");
		orderEntity.setName("最终订单");
		orderEntity.setTimes("12:33");
		orderEntity.setStates(0);
		orderEntity.setSumPrice(new BigDecimal("823.32"));
		o.save(orderEntity);

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
		
		Map<String,Object> sortParams = new HashMap<>();
		sortParams.put("id desc",null);
		p.setSortParams(sortParams);
		
		
		/* 模糊查询*/
		//p.addLike("address", "%湘潭市%");
		
		
		
		  
		
//		int currentPage = 4;  //当前页，默认第一页  可以动态改变
//		int pageSize = 6;      //每页5条
//		int limit = (currentPage - 1)  * pageSize; // 分页公式
//		p.openPager(limit, pageSize);
		
		list = o.queryOrdersList(p);
		OrderEntity t = null;
		for(Object y:list) {
			t = (OrderEntity) y;
			System.out.println(t);
		}
		
		
		//更新前
		System.out.println(t);
		
		p = new Params();
		Map<String,Object> updateParams = new HashMap<>();
		updateParams.put("id", "24");
		p.setUpdateParams(updateParams);
		t.setAddress("北京清华大学");
		o.update(p, t);
		

	}

}
