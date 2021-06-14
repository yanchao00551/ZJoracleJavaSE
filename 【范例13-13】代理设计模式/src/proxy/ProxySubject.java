package proxy;


public class ProxySubject extends Subject{  //�����ɫ�������̣�
	
	private RealSubject realSubject;   //����ʵ��ɫ��Ϊ�����ɫ������

	@Override
	public void request() {
		// TODO Auto-generated method stub
		preRequest();  //ǰ�ô���
		
		if(realSubject == null) {
			realSubject = new RealSubject();
		}
		
		realSubject.request();  //�˴�ִ����ʵ�����request����
		
		postRequest();  //���ô���
	}

	private void postRequest() {
		// TODO Auto-generated method stub
		System.out.println("������������Ʒ����");
	}

	private void preRequest() {
		// TODO Auto-generated method stub
		System.out.println("�����");
	}
	
}