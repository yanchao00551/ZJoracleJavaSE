package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 创建4个狗对象
		Dog ououDog = new Dog("欧欧","雪纳瑞");
		Dog yayaDog = new Dog("亚亚","拉布拉多");
		Dog meimeiDog = new Dog("美美","雪纳瑞");
		Dog feifeiDog = new Dog("菲菲","拉布拉多");
		
		
		//2  创建LinkedList集合对象 并把 四个狗狗对象放入其中
		LinkedList<Dog> dogs = new LinkedList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.addLast(meimeiDog);
		dogs.addFirst(feifeiDog);
		
		//3  查看集合中第一条狗狗的昵称
		Dog dogFirst = (Dog)dogs.getFirst();
		System.out.println("第一条狗狗的昵称是："+ dogFirst.getName() + "。");
		//4  查看集合中最后一条狗狗的昵称
		Dog dogLast = dogs.getLast();
		System.out.println("最后一条狗狗的昵称是：" + dogLast.getName() + "。");
		//5  删除接货中第一个狗狗和最后一个狗狗
		dogs.removeFirst();
		dogs.removeLast();
		
		
		//6 输出集合中狗狗的数量
		System.out.println("共计有：" + dogs.size() + "条狗狗");
		
	    //7 通过遍历集合显示各条狗狗
		System.out.println("分别是：");
		Iterator<Dog> itr = dogs.iterator();
		while(itr.hasNext()){
			Dog d = itr.next();
			System.out.println(d.getName() + "\t" + d.getStrain());
		}
		
		
		
		
	}

}
