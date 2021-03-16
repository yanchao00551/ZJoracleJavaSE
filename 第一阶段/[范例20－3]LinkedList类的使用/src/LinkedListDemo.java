import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建LinkedList对象
		LinkedList<String> LL = new LinkedList<String>();
		//加入元素到LinkedList中
		LL.add("F");
		LL.add("F");
		LL.add("D");
		LL.add("E");
		LL.add("C");
		//在链表的最后一个位置加上数据
		LL.addLast("Z");
		//在链表的第一个位置上加上数据
		LL.addFirst("A");
		//在链表的第二个元素的位置上加入数据
		LL.add(1, "A2");
		System.out.println("LL最初的内容："+LL);
		//从LinkedList中移除元素
		LL.remove("F");
		System.out.println("删除元素F后的LL内容："+LL);
		LL.remove(2);
		System.out.println("从LL中移除第二个元素的内容之后："+LL);
		//移除第一个和最后一个元素
		LL.removeFirst();
		LL.removeLast();
		System.out.println("LL移除第一个和最后一个元素之后的内容"+LL);
		//取得并设置值
		Object val = LL.get(2);
		LL.set(2, (String)val+" changed");
		System.out.println("LL被改变之后："+LL);
	}

}
