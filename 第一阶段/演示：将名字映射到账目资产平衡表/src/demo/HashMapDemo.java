package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建HashMap对象
		Map<String,Double> hm = new HashMap<String,Double>();
		//加入元素到HashMap中
		hm.put("张三", new Double(3434.34));
		hm.put("李四", new Double(13.22));
		hm.put("王五", new Double(1378.00));
		hm.put("赵六", new Double(99.22));
		
		//返回包含映射中项(entry)的集合
		Set<Map.Entry<String,Double>> set = hm.entrySet();
		
		//用Iterator得到HashMap中的内容
		Iterator<Map.Entry<String,Double>> i = set.iterator();
		//显示元素
		while(i.hasNext()) {
			//Map.entry可以操作映射的输入
			Map.Entry<String,Double> me =  i.next();
			System.out.print(me.getKey() + ":");
			System.out.println( me.getValue());
		}
		
		System.out.println();
		
		//让张三中的值增加1000
		double balance = hm.get("张三").doubleValue();
		//用新的值替换掉旧的值
		hm.put("张三", new Double(balance + 1000));
		System.out.println("张三现在的资金：" + hm.get("张三"));
		
	}

}
