package demo;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
 * classpath:  resources(Դ�ļ���)/lib/clases/bin/
 */
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//Properties���ʹ��  HashTable ʵ��Map
		Properties ps = new Properties();
		Class clazz = PropertiesDemo.class;
		InputStream inputStream  = clazz.getResourceAsStream("/database.properties.txt");
		ps.load(inputStream);
		
		
	    //ps  Map ѭ�� entrySet() ֪ʶ��
		//����  ��  �Ѽ�ֵ���������̨
		Set<Entry<Object,Object>> sList = ps.entrySet();
	    Iterator<Entry<Object,Object>> itr = sList.iterator();
	    while(itr.hasNext()) {
	    	Entry<Object,Object> e = itr.next();
	    	System.out.println("��" + e.getKey() + "\tֵ��" + e.getValue());
	    }
	    
	    //CLASSPATHĿ¼
	    
	}
}
