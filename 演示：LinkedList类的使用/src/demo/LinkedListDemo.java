package demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��LinkedList����
		LinkedList<String> LL = new LinkedList<String>();
		//����Ԫ�ص�LinkedList��
		LL.add("F");
		LL.add("F");
		LL.add("D");
		LL.add("E");
		LL.add("C");
		//���������һ��λ�ü�������
		LL.addLast("Z");
		//������ڶ���Ԫ�ص�λ���ϼ���Ԫ��
		LL.add(1, "A2");
		System.out.println("LL��������ݣ�" + LL);
		
		
	}

}
