import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList对象
		ArrayList<Integer> al = new ArrayList<Integer>();
		//向ArrayList中加入对象
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("ArrayList中的内容："+al);
		//得到对象内容
		Object[] ia = al.toArray();
		int sum = 0;
		for(int i=0;i<ia.length;i++) {
			sum += ((Integer)ia[i]).intValue();
		}
		System.out.println("数据累加结果是："+sum);
	}

}
