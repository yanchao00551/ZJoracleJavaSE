package demo;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator˫���������չ��Iterator
 * ����˫������б�
 */

public class ListIteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		//����Ԫ��
		al.add("Welcome");
		al.add("to");
		al.add("TianYan");
		
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			Object element = litr.next();
			//��set�����޸�������
			litr.set(element + "+") ;
		}
		
		//�����ǽ��б�����ݷ������
		while(litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.println(element + " ");
		}
		
	}

}
