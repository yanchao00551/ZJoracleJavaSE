package demo;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args) {
		
		//  �������㣺+,-,*,  ȫ�������������������д��������� ,�涨�����ǼӼ��˳� ����������Ҫ��ͳһ����BigDecimal
		BigDecimal bigA = new BigDecimal("888234582438382434382.2");  //���͸������ͣ����
		
		BigDecimal bigB = new BigDecimal("92923923.6");
		
		System.out.println("�ӷ�������" + bigA.add(bigB));
		System.out.println("����������" + bigA.subtract(bigB));
		System.out.println("�˷�������" + bigA.multiply(bigB));
		//BigDecimal.ROUND_DOWN ֵ����1λС��
		System.out.println("����������" + bigA.divide(bigB,BigDecimal.ROUND_DOWN)); 
		
	    	
	}
}
