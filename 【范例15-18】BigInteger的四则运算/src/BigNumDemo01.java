import java.math.BigInteger;

public class BigNumDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigA = new BigInteger("823894932983482389439");
		BigInteger bigB = new BigInteger("92923923");
		System.out.println("�ӷ�������"+bigA.add(bigB));
		System.out.println("����������"+bigA.subtract(bigB));
		System.out.println("�˷�������"+bigA.multiply(bigB));
		System.out.println("����������"+bigA.divide(bigB));
	}

}
