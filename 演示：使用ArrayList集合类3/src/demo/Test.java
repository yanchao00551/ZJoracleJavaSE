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
		
		
		//3 输出删除前集合中狗狗的数量
		System.out.println("删除之前共计有：" + dogs.size() + "条狗狗");
		
		//4、删除结合中第一个狗狗和feifeiDog狗狗
		dogs.remove(0);
		dogs.remove(feifeiDog);
		//5、显示删除后集合中各条狗狗信息
		System.out.println("\n删除之后还有" + dogs.size() + "条狗狗");
		System.out.println("分别是：");
	    // 通过遍历集合显示各条狗狗
		for(int i=0; i < dogs.size(); i++) {
			Dog dog = (Dog)dogs.get(i);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		
		//6  判断集合中是否包含指定狗狗信息
		if(dogs.contains(meimeiDog)){
			System.out.println("\n集合中包含美美的信息");
		}else {
			System.out.println("\n集合中不包含美美的信息");
		}
		
		
		
		
	}

}
