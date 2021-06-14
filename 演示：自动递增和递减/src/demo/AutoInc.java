package demo;

/*
 * 自动递增和自动递减
 * 前置递增和前置递减(如++a或--a),会先执行运算，再生成值
 * 后置递增和后置递减（如i++或i--),会先生成值，再执行运算
 */
public class AutoInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println("i : " + i); //1
		System.out.println("++i : " + ++i);  //2
		System.out.println("i++ : " + i++);  //2
		System.out.println("i : " + i);      //3
		
		System.out.println("--i :" + --i);    //2
		System.out.println("i-- :" + i--);    //2
		System.out.println("i : " + i);      //1
		
	}

}
