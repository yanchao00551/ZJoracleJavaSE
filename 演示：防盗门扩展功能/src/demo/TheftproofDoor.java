package demo;


/**
 * ��������
 * @author 10947
 *
 */
public class TheftproofDoor extends Door implements Lock,DoorDell{

	@Override
	public void lockUp() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��");
	}

	@Override
	public void openLock() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�ף�������תԿ����Ȧ�������ˣ��γ�Կ��");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("�����ƣ��Ŵ���");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�������ţ��Ź�����");
	}

	@Override
	public void takePrictures() {
		// TODO Auto-generated method stub
		System.out.println("��.........����........��Ƭ�Ѵ洢");
	}

	
	
}
