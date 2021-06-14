
public class ObjectInterface06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B(); //向上转型，为接口实例化
		Object obj = a;  //使用Object接收，向上转型
		A x = (A)obj;    //向下转型
		System.out.println(x.getInfo());
	}

}
