package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<String>> lm = new HashMap<String,List<String>>();
		
		List<String> s = new ArrayList<String>();
		s.add("world!");
		s.add("whoareyou");
		
	
		lm.put("hello", s);
		
		
		
		List<String> o = lm.get("hello");
		
		Iterator<String> irt = o.iterator();
		
		while(irt.hasNext()) {
			String s1= irt.next();
			System.out.println(s1);
		}
		
		
		
		//����TreeMap����
		Map<Integer,String> tm = new TreeMap<Integer,String>();
		//����Ԫ�ص�TreeMap��
		tm.put(new Integer(10000 - 2000), "����");
		tm.put(new Integer(10000 - 1500), "����");
		tm.put(new Integer(10000 - 2500), "����");
		tm.put(new Integer(10000 - 5000), "����");

		
		 Collection<String> col = tm.values();
		 
		//�������8000���key���ڷ���true
		//��  ���ڡ������� ���value���� ���� true
		if(tm.containsKey(8000) && tm.containsValue("����")) {  
			 tm.put(8000, "steven");
			 
			 Iterator<String> i = col.iterator();
			 System.out.println("�������ɵ͵���˳�������");
			 while(i.hasNext()) {
				 System.out.println(i.next());
			 }
		}
		
		
		 
	}

}

