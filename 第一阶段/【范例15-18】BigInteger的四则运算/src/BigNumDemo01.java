import java.math.BigInteger;

public class BigNumDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigA = new BigInteger("823894932983482389439");
		BigInteger bigB = new BigInteger("92923923");
		System.out.println("加法操作："+bigA.add(bigB));
		System.out.println("减法操作："+bigA.subtract(bigB));
		System.out.println("乘法操作："+bigA.multiply(bigB));
		System.out.println("除法操作："+bigA.divide(bigB));
	}

}
