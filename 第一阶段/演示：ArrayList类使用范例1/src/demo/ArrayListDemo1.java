package demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ArrayList����
		List<String> al  = new ArrayList<String>();
		System.out.println("al��Ԫ�صĸ�����" + al.size());
		//��ArrayList���������������
		al.add("C"); //�������б�0λ�����Ԫ��C
		al.add("A"); //�������б�1λ�����Ԫ��A
		al.add("E");  //�������б�2λ�����Ԫ��E
		al.add("B"); //�������б�3λ�����Ԫ��B
		al.add("D");  //�������б�4λ�����Ԫ��D
		al.add("F");  //�������б�5λ�����Ԫ��F
		//��A2����ArrayList����ĵ�2��λ��
		al.add(1, "A2");  //��1λ�����A2���б�����Ϊ C A2 A E B D F
		System.out.println("al����Ԫ��֮���Ԫ�ظ�����" + al.size());
		
		//��ʾArrayList����
		System.out.println("al�����ݣ�" + al);
		
		//��ArrayList���Ƴ�Ԫ��
		al.remove("F"); //ɾ��Ԫ��F����ʱ���� C A2 A E B D
		al.remove(2);  //ɾ���±�Ϊ2��Ԫ�أ���ʱ�����б�Ϊ C A2 E B D
		System.out.println("alɾ��Ԫ��֮���Ԫ�ظ�����" + al.size());
		System.out.println("al������:" + al);
		
	}

}
