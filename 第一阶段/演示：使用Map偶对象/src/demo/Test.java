package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Mapż����  ���ָ������  �ұ߿���ʡ��  
		Map<String,List<Object>> m = new HashMap<>();   //����ʵ�  

	    Map<String,Object> j = new HashMap<>();
	    
	    
	    
	    
		
		
		//1 ����4��������
		Dog ououDog = new Dog("ŷŷ","ѩ����");
		Dog yayaDog = new Dog("����","��������");
		Dog meimeiDog = new Dog("����","ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�","��������");
		
		
		//2  ����ArrayList���϶��� ���� �ĸ����������������
		List<Object> dogs = new ArrayList<>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);  //���feifeiDog��ָ��λ��
		
		
		m.put("4����", dogs);
		
		j.put("m", m);
	    //������ϰ  ����j ��ȡ  ��4���������Ʊ�������
		Object mObj = j.get("m");
		Map<String,List<Object>> mValue = (Map<String, List<Object>>) mObj;
		List<Object> dogList = mValue.get("4����");
		m.put("4����", dogList);

		
		
		
		//����Keyȡ��
		Set<String> keys =  m.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		Collection<List<Object>> values= m.values();
		
		//ȡ�ö����ӡ
		Iterator<List<Object>> itrValue = values.iterator();
		List<Object> v = null;
		while(itrValue.hasNext()) {
			v = itrValue.next(); //ÿ�ε��� �õ�ֵ��List����
			for(Object d:v) {   //�����õ��Ķ��� list  
				if(d instanceof Dog) {
					Dog s = (Dog)d;
					System.out.println(s.getStrain());
				}
			}
		}
	
		
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
