package demo;

import java.util.Arrays;

/*
 * ϵͳ������
 */
public class Controller extends Config{
	
	/*
	 * ���п��� ����
	 */
	public void run() {
		//��һ���������û�����
		int[] b = User.inputArr();
		//�ڶ��� �����û�¼����������
		ArraySort.bubbleSort(b, 1);
		//���������û�����index
		int index = User.inputIndex();
		//���Ĳ�����������㷨
		ArrayInsert.arrInsert(C, index, NUMBER);
		//���岽��b�����滻������
		ArrayInsert.arrToDetails(b, C, index + NUMBER - 1, index, 0);
	    //��������ǰ�������� ���� ,�ֲ�����
		ArraySort.bubbleSort(C, 0,  index-1, 2);
		//���߲������������� ���򣬾ֲ�����
		ArraySort.bubbleSort(C, index + NUMBER, C.length - 1, 1);
		//�ڰ˲���Arrays.toString()�������C
		System.out.println(Arrays.toString(C));
	}
}
