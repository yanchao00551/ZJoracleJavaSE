package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ����4��������
		Dog ououDog = new Dog("ŷŷ","ѩ����");
		Dog yayaDog = new Dog("����","��������");
		Dog meimeiDog = new Dog("����","ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�","��������");
		
		
		//2  ����ArrayList���϶��� ���� �ĸ����������������
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);  //���feifeiDog��ָ��λ��
		
		
		//3 ��������й���������
		System.out.println("�����У�" + dogs.size() + "������");
		
	    //4 ͨ������������ʾ��������
		System.out.println("�ֱ��ǣ�");
		Iterator<Dog> itr = dogs.iterator();
		while(itr.hasNext()){
			Dog d = itr.next();
			System.out.println(d.getName() + "\t" + d.getStrain());
		}
		
		
		
		
	}

}
