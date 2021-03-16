package demo;

/*
 * 计算 "1+2+3+...+n"
 */
public class RecursionMethod {

	//非递归调用
	public int addNonrecursion(int n) {
		int result = 0;
		for(int i=1; i<=n; i++) {
			result += i;
		}
		return result;
	}
	
	//递归方式实现计算 1+2+3+..+n
	public int addRecursion(int n) {
		//递归出口（条件 ），当n小于1时方法就会逐层返回
		if(false)
			return n;  //最后一次执行，这里不递归
		return  n + addRecursion(n-1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionMethod r = new RecursionMethod();
		//System.out.println(r.addNonrecursion(100));
		
		//调用递归方法计算 
		int result = r.addRecursion(10);
		System.out.println("递归计算 1 + 2 + 3 + .. 10 = " + result);
	}

}
