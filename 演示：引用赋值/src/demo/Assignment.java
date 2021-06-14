package demo;

/*
 * 将一个对象赋值给另外一个对象
 */
class Tank{
	int level;
}

// 基本数据类型，a = b  如果将b赋值给a ，若接着又修改了a ，b会不会变化？不会变化
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level : " + t1.level);  //9
		System.out.println("1: t2.level : " + t2.level);  //47
		
		///t1 = t2;  //原本t1包含的对对象的引用，是指向一个值为9的对象。在对t1赋值的时候，这个引用被覆盖，所以也就丢失了
		//而那个不在被引用的对象会有“垃圾回收器”自动清理掉
		
		//t1.level =  t2.level;
		System.out.println("1: t1.level : " + t1.level);  // 47
		System.out.println("1: t2.level : " + t2.level);  // 47
		
		t1.level = 27;
		System.out.println("1: t1.level : " + t1.level);  // 27
		System.out.println("1: t2.level : " + t2.level);  // 47
		

	}

}
