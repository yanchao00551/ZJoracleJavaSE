
public class StringArray {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "hellojava";
//		char data[] = str.toCharArray();
//		for(int i=0;i<data.length;i++) {
//			System.out.print(data[i]+"��");
//			data[i] -= 32;  //Сд��Ϊ��д
//		}
//		System.out.println();
//		System.out.println("��ȫ���ַ������Ϊ�ַ�����"+new String(data));
//		//ȡ�ò������ݵ�ʱ����Ҫ������ʼ���ȡ�õĳ���
//		System.out.println("�������ַ������Ϊ�ַ�����"+new String(data,5,4));
		String a = "ab";
		String b = "a" + "b";
		System.out.println(a == b);
		
		String a1 = "ab";
		String b1 = "cd";
		String c = "abcd";
		String d = a1 + b1;
		
		System.out.println(c.equals(d));
	}

}
