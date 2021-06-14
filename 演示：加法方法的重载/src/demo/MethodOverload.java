package demo;

public class MethodOverload {

	//计算两个整数之和
	public int add(int a,int b) {
		return a + b;
	}
	
	//加个add方法的重载，计算两个单精度浮点数之和
	public float add(float a,float b) {
		return a + b;
	}
	
	//计算三个整数之和
	public int add(int a,int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  result;
		float result_f;
		MethodOverload test = new MethodOverload();
		
		//调用计算两个整数之和的add方法,jvm通过实参和个数进行区分，自然知道调用的重载方法
		result = test.add(1, 2);
		System.out.println("add计算 1 + 2的和：" + result);

		
		//调用计算两个单精度之和和add方法
		result_f = test.add(1.2f, 1.3f);
		System.out.println("add计算 1.2 + 2.3的和：" + result_f);
		
		
		//调动计算三个整数之和的add方法
		result = test.add(1, 2, 3);
		System.out.println("add计算 1 + 2 + 3的和：" + result);

		
		
	}

}
