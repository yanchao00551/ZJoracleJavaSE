package demo;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		int sum = 0;
		int[][] num = {
				{30,35,26,32},
				{33,34,30,29}
		};  //声明数组并设置初值
		
		for(int i=0; i<num.length; i++) {  //遍历行
			System.out.println("第" + (i+1)+ "个人的成绩为：");
			for(int j = 0; j < num[i].length; j++) {  //遍历列
				System.out.println(num[i][j] + "  ");
				sum += num[i][j];
			}
			System.out.println();
		}
		System.out.println("\n 总成绩是：" + sum + "分！");
	}
}
