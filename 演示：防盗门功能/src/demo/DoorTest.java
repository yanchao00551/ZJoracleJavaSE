package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * @author 10947
 *
 */
public class DoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������Ŷ���
		TheftproofDoor tfd = new TheftproofDoor();

	
		tfd.close();  //����
		tfd.lockUp();   // ����
		tfd.openLock();   //����
		tfd.open();   //����

	
		
		//��Ϊ�������д����  Lock�ӿ�����  ��̬д�� 
		//���� ���Ƕ���tfdֻ����  Lock�ӿڵ�  2��  ����  lockUp openLock  
		//Ȼ�� ���ǻ���Ҫ����  ����open �� ����close�ķ��� 
		// tfd������ ��2������  ���Զ�̬д��  Ҫ����ʵ���������
		
		
	}

}
