import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����TreeMap����
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		//����Ԫ�ص�TreeMap��
		tm.put(new Integer(10000-2000), "����");
		tm.put(new Integer(10000-1500), "����");
		tm.put(new Integer(10000-2500), "����");
		tm.put(new Integer(10000-5000), "����");
		Collection<String> col = tm.values();
		Iterator<String> i = col.iterator();
		System.out.println("�������ɵ͵��ߵ�˳�������");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
