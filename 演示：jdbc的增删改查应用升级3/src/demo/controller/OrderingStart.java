package demo.controller;

import demo.service.OrderService;

public class OrderingStart {
	public static void main(String[] args){
		OrderService om = new OrderService();
		om.initial();     
		om.startMenu();  
	}
}
