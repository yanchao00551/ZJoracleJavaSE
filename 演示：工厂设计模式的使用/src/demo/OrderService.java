package demo;

public class OrderService {
	
	/**
	 * ���ɶ��� V1.0
	 * ���´������汾
	 * add�������иı䣬��ǰ��OrderDaoImplʵ�����save
	 * �Ѿ����������ҵ������ˣ�����Ķ��ܶ࣬
	 * service��ĸĶ��޴��
	 * 
	 * service��߶�����dao��ʵ����
	 * 
	 * �������ģʽ�ܹ��� service���daoʵ�������
	 */
	public void add() {
		//��������Ϣ��ҵ���߼�  
		//....
		
		//������ɣ��Ѷ������ݱ������ݿ�

		//ҵ���߼��� ��  DAO��
		OrderDao orderDao = new OrderDaoImpl();
		orderDao.save2();   
	}
}
