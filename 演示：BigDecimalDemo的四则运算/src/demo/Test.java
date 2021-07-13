package demo;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		
		//  四则运算：+,-,*,  全部给方法给替代，不能写四则运算符 ,规定不管是加减乘除 ，操作对象都要是统一类型BigDecimal
		BigDecimal bigA = new BigDecimal("888234582438382434382.2");  //大型浮点类型，金额
		
		BigDecimal bigB = new BigDecimal("92923923.6");
		
		System.out.println("加法操作：" + bigA.add(bigB));
		System.out.println("减法操作：" + bigA.subtract(bigB));
		System.out.println("乘法操作：" + bigA.multiply(bigB));
		//BigDecimal.ROUND_DOWN 值保留1位小数
		System.out.println("除法操作：" + bigA.divide(bigB,BigDecimal.ROUND_DOWN)); 
		
	    	
	}
}
