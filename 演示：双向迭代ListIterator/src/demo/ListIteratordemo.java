package demo;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator双向迭代器扩展了Iterator
 * 允许双向遍历列表
 */

public class ListIteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		//加入元素
		al.add("Welcome");
		al.add("to");
		al.add("TianYan");
		
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			Object element = litr.next();
			//用set方法修改其内容
			litr.set(element + "+") ;
		}
		
		//下面是将列表的内容反向输出
		while(litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.println(element + " ");
		}
		
	}

}
