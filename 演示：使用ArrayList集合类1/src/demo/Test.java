package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		//创建一个集合容器，容器里装Dog类型的对象
		List<Dog> list = new ArrayList<Dog>();
		Dog dog1 = new Dog();
		dog1.setStrain("雪纳瑞");
		Dog dog2 = new Dog();
		dog1.setStrain("拉布拉多");
		list.add(dog1);
		list.add(dog2);
		
		//循环遍历 方式1  for循环
		for(int i=0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//循环遍历  方式2    foreach增强循环
		for(Dog s:list) {
			System.out.println(s);
		}
		
		//循环遍历  方式3  Iterator 迭代器
		Iterator<Dog> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//循环遍历 方式4  stream流
		list.forEach((item) -> {
            System.out.println(item);
        });
		
		
		//根据下标获取指定的对象
		Dog dog3 = list.get(1);
		System.out.println(dog3);

		//获取集合的长度
		System.out.println(list.size());
		
		
		//获取双向迭代器
		ListIterator<Dog> listItr = list.listIterator();
		while(listItr.hasPrevious()) {
			//获取上一个
			Dog d = (Dog) listItr.previous();
			System.out.println(d);
		}





	}
}
