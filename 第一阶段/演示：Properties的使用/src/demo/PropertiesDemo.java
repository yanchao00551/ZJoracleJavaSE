package demo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		Set<Object> states;
		String str;
		//�̳й�ϵ�����������͵ȼ���
		Properties capitals = new Properties();
		
		capitals.put("�й�", "����");
		capitals.put("����˹", "Ī˹��");
		capitals.put("�ձ�", "����");
		capitals.put("����", "����");
		capitals.put("Ӣ��", "�׶�");
		
	   
		states = capitals .keySet();	//����һ������Set����
	    Iterator<Object>  itr = states.iterator();
	    
	    while(itr.hasNext()) {
	    	str = (String)itr.next();
	    	System.out.println("���ң�" + str + ",  �׶���" + capitals.getProperty(str));
	    }
	    System.out.println();
	    
	    //���"����"�ü������ڣ��򷵻�Ĭ��ֵ
	    str = capitals.getProperty("����", "û�з���");
	    System.out.println("�������׶���" + str + ".");
	}
	
	
}
