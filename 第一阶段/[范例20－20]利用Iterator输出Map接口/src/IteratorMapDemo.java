import java.util.*;
import java.util.Map.Entry;

public class IteratorMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(3, "����");
		Set<Entry<Integer,String>> set = map.entrySet();
		Iterator<Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> me = itr.next();
			System.out.println(me.getKey() + "--->" + me.getValue());
		}
	}

}
