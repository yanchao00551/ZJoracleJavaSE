package demo.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.crezyman.utils.Params;

import demo.domain.Person;
import demo.service.OrderService;
import demo.service.PersonService;

public class OrderingStart {
	private static final Logger log = Logger.getLogger(OrderingStart.class);
	
	public static void main(String[] args){
		OrderService om = new OrderService();
		//om.initial();     //初始化订单数据
		//om.startMenu();   
		
		Params params = new Params();
		PersonService personService = new PersonService();
		personService.queryPersonAndBookList(params);
		
		
		//方案二 ：方法 实现连表查询，真正实现了连表查询 LEFT JOIN
    	System.out.println("LEFT JOIN连表查询方案二：");
    	List<Object> list = personService.queryPersonAndBookList(params);
    	for(Object y:list) {
			Person t = (Person) y;
			log.info(t);
		}
    	
    	
    	
	}
}
