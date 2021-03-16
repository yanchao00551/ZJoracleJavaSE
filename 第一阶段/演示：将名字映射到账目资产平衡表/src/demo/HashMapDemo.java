package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����HashMap����
		Map<String,Double> hm = new HashMap<String,Double>();
		//����Ԫ�ص�HashMap��
		hm.put("����", new Double(3434.34));
		hm.put("����", new Double(13.22));
		hm.put("����", new Double(1378.00));
		hm.put("����", new Double(99.22));
		
		//���ذ���ӳ������(entry)�ļ���
		Set<Map.Entry<String,Double>> set = hm.entrySet();
		
		//��Iterator�õ�HashMap�е�����
		Iterator<Map.Entry<String,Double>> i = set.iterator();
		//��ʾԪ��
		while(i.hasNext()) {
			//Map.entry���Բ���ӳ�������
			Map.Entry<String,Double> me =  i.next();
			System.out.print(me.getKey() + ":");
			System.out.println( me.getValue());
		}
		
		System.out.println();
		
		//�������е�ֵ����1000
		double balance = hm.get("����").doubleValue();
		//���µ�ֵ�滻���ɵ�ֵ
		hm.put("����", new Double(balance + 1000));
		System.out.println("�������ڵ��ʽ�" + hm.get("����"));
		
	}

}
