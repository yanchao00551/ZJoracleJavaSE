package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ����4��������
		Dog ououDog = new Dog("ŷŷ","ѩ����");
		Dog yayaDog = new Dog("����","��������");
		Dog meimeiDog = new Dog("����","ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�","��������");
		
		
		//2  ����LinkedList���϶��� ���� �ĸ����������������
		LinkedList<Dog> dogs = new LinkedList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.addLast(meimeiDog);
		dogs.addFirst(feifeiDog);
		
		//3  �鿴�����е�һ���������ǳ�
		Dog dogFirst = (Dog)dogs.getFirst();
		System.out.println("��һ���������ǳ��ǣ�"+ dogFirst.getName() + "��");
		//4  �鿴���������һ���������ǳ�
		Dog dogLast = dogs.getLast();
		System.out.println("���һ���������ǳ��ǣ�" + dogLast.getName() + "��");
		//5  ɾ���ӻ��е�һ�����������һ������
		dogs.removeFirst();
		dogs.removeLast();
		
		
		//6 ��������й���������
		System.out.println("�����У�" + dogs.size() + "������");
		
	    //7 ͨ������������ʾ��������
		System.out.println("�ֱ��ǣ�");
		Iterator<Dog> itr = dogs.iterator();
		while(itr.hasNext()){
			Dog d = itr.next();
			System.out.println(d.getName() + "\t" + d.getStrain());
		}
		
		
		
		
	}

}
