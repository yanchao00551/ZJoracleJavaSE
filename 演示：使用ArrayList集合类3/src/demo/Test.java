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
		
		
		//3 ���ɾ��ǰ�����й���������
		System.out.println("ɾ��֮ǰ�����У�" + dogs.size() + "������");
		
		//4��ɾ������е�һ��������feifeiDog����
		dogs.remove(0);
		dogs.remove(feifeiDog);
		//5����ʾɾ���󼯺��и���������Ϣ
		System.out.println("\nɾ��֮����" + dogs.size() + "������");
		System.out.println("�ֱ��ǣ�");
	    // ͨ������������ʾ��������
		for(int i=0; i < dogs.size(); i++) {
			Dog dog = (Dog)dogs.get(i);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		
		//6  �жϼ������Ƿ����ָ��������Ϣ
		if(dogs.contains(meimeiDog)){
			System.out.println("\n�����а�����������Ϣ");
		}else {
			System.out.println("\n�����в�������������Ϣ");
		}
		
		
		
		
	}

}
