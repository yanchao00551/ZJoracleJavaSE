package demo;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
 * classpath:  resources(源文件夹)/lib/clases/bin/
 */
public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		//Properties类的使用  HashTable 实现Map
		Properties ps = new Properties();
		Class clazz = PropertiesDemo.class;
		InputStream inputStream  = clazz.getResourceAsStream("/database.properties.txt");
		ps.load(inputStream);
		
		
	    //ps  Map 循环 entrySet() 知识点
		//需求  ：  把键值对输出控制台
		Set<Entry<Object,Object>> sList = ps.entrySet();
	    Iterator<Entry<Object,Object>> itr = sList.iterator();
	    while(itr.hasNext()) {
	    	Entry<Object,Object> e = itr.next();
	    	System.out.println("键" + e.getKey() + "\t值：" + e.getValue());
	    }
	    
	    //CLASSPATH目录
	    
	}
}
