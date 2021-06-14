import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����HashMap����
		HashMap<String,Double> hm = new HashMap<String,Double>();
		//����Ԫ�ص�HashMap��
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Todd Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));
		//���ذ���ӳ������ļ���
		Set<Entry<String,Double>> set = hm.entrySet();
		//��iterator�õ�HashMap�е�����
		Iterator<Entry<String,Double>> itr = set.iterator();
		//��ʾԪ��
		while(itr.hasNext()) {
			//Map.Entry ���Բ���ӳ�������
			Map.Entry<String, Double> me = (Map.Entry<String,Double>)itr.next(); 
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		//��John Doe�е�ֵ����1000
		double balance =((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));
		System.out.println("John Does's���ڵ��ʽ�" + hm.get("John Doe"));
	}

}
