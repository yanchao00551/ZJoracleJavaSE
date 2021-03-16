package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 创建4个狗对象
		Dog ououDog = new Dog("欧欧","雪纳瑞");
		Dog yayaDog = new Dog("亚亚","拉布拉多");
		Dog meimeiDog = new Dog("美美","雪纳瑞");
		Dog feifeiDog = new Dog("菲菲","拉布拉多");
		
		
		//2  创建ArrayList集合对象 并把 四个狗狗对象放入其中
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);  //添加feifeiDog到指定位置
		
		
		//3 输出集合中狗狗的数量
		System.out.println("共计有：" + dogs.size() + "条狗狗");
		
	    //4 通过遍历集合显示各条狗狗
		System.out.println("分别是：");
		Iterator<Dog> itr = dogs.iterator();
		while(itr.hasNext()){
			Dog d = itr.next();
			System.out.println(d.getName() + "\t" + d.getStrain());
		}
		
		
		
		
	}

}
