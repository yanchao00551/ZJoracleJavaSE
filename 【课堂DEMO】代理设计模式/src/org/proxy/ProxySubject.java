package org.proxy;

/**
 * �����ɫ ��������  AOP�����Ҫ����ʵ�ֵ�ĳ�������ࣩ
 * @author 10947
 *
 */
public class ProxySubject extends Subject {
	private RealSubject realSubject;  //����ʵ��ɫ��Ϊ�����ɫ������
	

	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();  //���� �����Ʒ�� ��2��1
		
		
		//����  
		if(realSubject == null) {
			realSubject = new RealSubject();  // DI ����ע��
		}

		realSubject.request();  //��ʵ�����request����
		
		
		lastRequest();  //����   ���ȿͻ������������  ���� ���������  �����������Ʒ
		
	}

	
	//���ǿͻ���û����֮ǰ  �������Զ���ķ���  AOP  ǰ����ǿ���� 
	private void preRequest() {
		// TODO Auto-generated method stub
		System.out.println("���� �����Ʒ�� ��2��1 ���ǿͻ���û����֮ǰ  �������Զ���ķ���  AOP  ǰ����ǿ���� ");
	}


	//����ִ���� ������ʵ��ɫ ��ServiceImpl)��ĳ��������� ����   ������ǿ����
	private void lastRequest() {
		// TODO Auto-generated method stub
		System.out.println("����   ���ȿͻ������������  ���� ���������  �����������Ʒ ����   ���ȿͻ������������  ���� ���������  �����������Ʒ");
	}
	
}


