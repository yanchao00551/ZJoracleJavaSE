package demo;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		int sum = 0;
//		for(i=1; i<11; i++) {
//			sum += i;
//		}
//		System.out.println("1 + 2 + 3 + ... + 10 = " + sum);
		
		for(int i = 1; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			    break;
			}
			System.out.print("\n");
		}
	}
}
