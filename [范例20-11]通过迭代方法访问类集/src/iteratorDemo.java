import java.util.ArrayList;
import java.util.Iterator;


public class iteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ArrayList����
		ArrayList<String> al = new ArrayList<String>();
		//����Ԫ�ص�ArrayList��
		al.add("WelCome");
		al.add("to");
		al.add("HAUT");
		//ʹ��iterator��ʾal�е�����
		System.out.println("al�е������ǣ�");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
