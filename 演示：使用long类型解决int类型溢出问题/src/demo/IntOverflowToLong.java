package demo;

public class IntOverflowToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(max + (long)1);  //int型 + long型 = long型 2147483648
		System.out.println(max + 2L);   //int型 + long型 = long型 2147483649
		System.out.println(min - 1L);   //int型 - long型 = long型 -2147483649
	}

}
