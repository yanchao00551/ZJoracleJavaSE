import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList对象
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("al中元素的个数："+al.size());
		//向ArrayList中添加新内容
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		//把A2加在ArrayList对象的第2个位置
		al.add(1, "A2");
		System.out.println("al加入元素之后的元素个数："+al.size());
		//显示ArrayList的数据
		System.out.println(al);
		//从ArrayList中移除元素
		al.remove("F"); //删除元素F
		al.remove(2); //删除下标为二的元素
		System.out.println("删除元素之后的个数："+al.size());
		System.out.println("al的内容："+al);
		
		
	}

}
