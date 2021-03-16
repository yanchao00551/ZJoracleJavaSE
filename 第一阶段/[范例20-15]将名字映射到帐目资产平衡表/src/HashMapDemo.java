import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建HashMap对象
		HashMap<String,Double> hm = new HashMap<String,Double>();
		//加入元素到HashMap中
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		//返回包含映射中项的集合
		Set<Entry<String,Double>> set = hm.entrySet();
		//用iterator得到HashMap中的内容
		Iterator<Entry<String,Double>> itr = set.iterator();
		//显示元素
		while(itr.hasNext()) {
			//Map.Entry 可以操作映射的数据
			Map.Entry<String, Double> me = (Map.Entry<String,Double>)itr.next(); 
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		//让John Doe中的值增加1000
		double balance =((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Does's现在的资金：" + hm.get("John Doe"));
	}

}
