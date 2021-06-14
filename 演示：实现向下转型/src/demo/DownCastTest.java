package demo;

public class DownCastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();      //实例化子类对象
		a.print();           //调用子类B的print
		
		
		//instanceof运算符  进行类型匹配 A B，instanceof检测是否类型等价如果等价
		//如果等价则可以进行强制类型转换
		if(a instanceof B) {
			B b = (B)a;
			b.getB();    //子类对象b可找到getB()
		}
		
	}

}
