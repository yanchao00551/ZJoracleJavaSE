import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建TreeMap对象
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		//加入元素到TreeMap中
		tm.put(new Integer(10000-2000), "张三");
		tm.put(new Integer(10000-1500), "李四");
		tm.put(new Integer(10000-2500), "王五");
		tm.put(new Integer(10000-5000), "赵六");
		Collection<String> col = tm.values();
		Iterator<String> i = col.iterator();
		System.out.println("按工资由低到高的顺序输出：");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
