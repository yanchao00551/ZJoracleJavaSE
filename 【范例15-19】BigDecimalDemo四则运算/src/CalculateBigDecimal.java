import java.math.BigDecimal;

public class CalculateBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bigA = new BigDecimal("82348239234929344239.2");
		BigDecimal bigB = new BigDecimal("929329932.6");
		System.out.println("�ӷ�������"+bigA.add(bigB));
		System.out.println("����������"+bigA.subtract(bigB));
		System.out.println("�˷�������"+bigA.multiply(bigB));
		System.out.println("����������"+bigA.divide(bigB,BigDecimal.ROUND_DOWN));

	}
}
