import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ArrayList����
		ArrayList<Integer> al = new ArrayList<Integer>();
		//��ArrayList�м������
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("ArrayList�е����ݣ�"+al);
		//�õ���������
		Object[] ia = al.toArray();
		int sum = 0;
		for(int i=0;i<ia.length;i++) {
			sum += ((Integer)ia[i]).intValue();
		}
		System.out.println("�����ۼӽ���ǣ�"+sum);
	}

}
