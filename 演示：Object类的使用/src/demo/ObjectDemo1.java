package demo;


/*
 * 可以清楚的发现，直接输出对象，与调用toString()方法后再输出其内容
 * 完全一样，就可以得出一个结论。对象输出时，会默认调用Object类的toString()
 * 方法，将对象信息变为字符串返回。但是从程序中可以看到，在打印对象p的时候
 * 实际上打印出来的是一些无序的字符串，这样的字符串很少有人能看懂什么意思。
 */
public class ObjectDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p);   //直接输出对象
		System.out.println(p.toString());
	}

}
