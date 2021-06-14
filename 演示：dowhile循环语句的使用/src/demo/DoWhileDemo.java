package demo;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		//do.while 循环 是先执行1次循环体，再进行判断。即使不满足任何条件循环体至少被执行1次
		do {
			//总会被执行的
			sum += i;
			i++;
		}while(i <= 10);
		System.out.println("1 + 2 + 3 + ... + 10 = " + sum);
	}

}
