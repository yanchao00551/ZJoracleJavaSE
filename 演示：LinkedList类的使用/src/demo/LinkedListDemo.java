package demo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个LinkedList对象
		LinkedList<String> LL = new LinkedList<String>();
		//加入元素到LinkedList中
		LL.add("F");
		LL.add("F");
		LL.add("D");
		LL.add("E");
		LL.add("C");
		//在链表最后一个位置加上数据
		LL.addLast("Z");
		//在链表第二个元素的位置上加入元素
		LL.add(1, "A2");
		System.out.println("LL最初的内容：" + LL);
		
		
	}

}
