import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��ArrayList����
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("al��Ԫ�صĸ�����"+al.size());
		//��ArrayList�����������
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//��A2����ArrayList����ĵ�2��λ��
		al.add(1, "A2");
		System.out.println("al����Ԫ��֮���Ԫ�ظ�����"+al.size());
		//��ʾArrayList������
		System.out.println(al);
		//��ArrayList���Ƴ�Ԫ��
		al.remove("F"); //ɾ��Ԫ��F
		al.remove(2); //ɾ���±�Ϊ����Ԫ��
		System.out.println("ɾ��Ԫ��֮��ĸ�����"+al.size());
		System.out.println("al�����ݣ�"+al);
		
		
	}

}
