package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		//����һ������������������װDog���͵Ķ���
		List<Dog> list = new ArrayList<Dog>();
		Dog dog1 = new Dog();
		dog1.setStrain("ѩ����");
		Dog dog2 = new Dog();
		dog1.setStrain("��������");
		list.add(dog1);
		list.add(dog2);
		
		//ѭ������ ��ʽ1  forѭ��
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//ѭ������  ��ʽ2    foreach��ǿѭ��
		for(Dog s:list) {
			System.out.println(s);
		}
		
		//ѭ������  ��ʽ3  Iterator ������
		Iterator<Dog> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//�����±��ȡָ���Ķ���
		Dog dog3 = list.get(1);
		System.out.println(dog3);

		//��ȡ���ϵĳ���
		System.out.println(list.size());
		
		
		//��ȡ˫�������
		ListIterator<Dog> listItr = list.listIterator();
		while(listItr.hasPrevious()) {
			Dog d = (Dog) listItr.previous();  //��ȡ��һ��
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
	}
}
