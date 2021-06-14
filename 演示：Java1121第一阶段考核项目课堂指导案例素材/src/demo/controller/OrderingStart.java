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
		//om.initial();     //��ʼ����������
		//om.startMenu();   
		
		Params params = new Params();
		PersonService personService = new PersonService();
		personService.queryPersonAndBookList(params);
		
		
		//������ ������ ʵ�������ѯ������ʵ���������ѯ LEFT JOIN
    	System.out.println("LEFT JOIN�����ѯ��������");
    	List<Object> list = personService.queryPersonAndBookList(params);
    	for(Object y:list) {
			Person t = (Person) y;
			log.info(t);
		}
    	
    	
    	
	}
}
