package demo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	
	public static void main(String[] args) {
		Set<Object> states;
		String str;
		//继承关系会存在类的类型等价性
		Properties capitals = new Properties();
		
		capitals.put("中国", "北京");
		capitals.put("俄罗斯", "莫斯科");
		capitals.put("日本", "东京");
		capitals.put("法国", "巴黎");
		capitals.put("英国", "伦敦");
		
	   
		states = capitals .keySet();	//返回一个键的Set集合
	    Iterator<Object>  itr = states.iterator();
	    
	    while(itr.hasNext()) {
	    	str = (String)itr.next();
	    	System.out.println("国家：" + str + ",  首都：" + capitals.getProperty(str));
	    }
	    System.out.println();
	    
	    //如果"美国"该键不存在，则返回默认值
	    str = capitals.getProperty("美国", "没有发现");
	    System.out.println("美国的首都：" + str + ".");
	}
	
	
}
