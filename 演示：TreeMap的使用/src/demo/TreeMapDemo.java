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
		
		
		
		//创建TreeMap对象
		Map<Integer,String> tm = new TreeMap<Integer,String>();
		//加入元素到TreeMap中
		tm.put(new Integer(10000 - 2000), "张三");
		tm.put(new Integer(10000 - 1500), "李四");
		tm.put(new Integer(10000 - 2500), "王五");
		tm.put(new Integer(10000 - 5000), "赵六");

		
		 Collection<String> col = tm.values();
		 
		//如果存在8000这个key存在返回true
		//且  存在”张三“ 这个value存在 返回 true
		if(tm.containsKey(8000) && tm.containsValue("张三")) {  
			 tm.put(8000, "steven");
			 
			 Iterator<String> i = col.iterator();
			 System.out.println("按工资由低到高顺序输出：");
			 while(i.hasNext()) {
				 System.out.println(i.next());
			 }
		}
		
		
		 
	}

}

