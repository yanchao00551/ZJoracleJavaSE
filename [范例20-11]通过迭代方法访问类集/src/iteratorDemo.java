import java.util.ArrayList;
import java.util.Iterator;


public class iteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个ArrayList数组
		ArrayList<String> al = new ArrayList<String>();
		//加入元素到ArrayList中
		al.add("WelCome");
		al.add("to");
		al.add("HAUT");
		//使用iterator显示al中的内容
		System.out.println("al中的内容是：");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
