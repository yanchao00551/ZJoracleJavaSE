import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����LinkedList����
		LinkedList<String> LL = new LinkedList<String>();
		//����Ԫ�ص�LinkedList��
		LL.add("F");
		LL.add("F");
		LL.add("D");
		LL.add("E");
		LL.add("C");
		//����������һ��λ�ü�������
		LL.addLast("Z");
		//������ĵ�һ��λ���ϼ�������
		LL.addFirst("A");
		//������ĵڶ���Ԫ�ص�λ���ϼ�������
		LL.add(1, "A2");
		System.out.println("LL��������ݣ�"+LL);
		//��LinkedList���Ƴ�Ԫ��
		LL.remove("F");
		System.out.println("ɾ��Ԫ��F���LL���ݣ�"+LL);
		LL.remove(2);
		System.out.println("��LL���Ƴ��ڶ���Ԫ�ص�����֮��"+LL);
		//�Ƴ���һ�������һ��Ԫ��
		LL.removeFirst();
		LL.removeLast();
		System.out.println("LL�Ƴ���һ�������һ��Ԫ��֮�������"+LL);
		//ȡ�ò�����ֵ
		Object val = LL.get(2);
		LL.set(2, (String)val+" changed");
		System.out.println("LL���ı�֮��"+LL);
	}

}
