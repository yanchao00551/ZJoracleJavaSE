import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrInt[] = {17,40,12,6,15,16,8,10,18,50};
		//升序排序数组arrInt
		Arrays.sort(arrInt);
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入需要查找的整数：");
		int search = scan.nextInt();
		//输出排序后的数组
		for(int i = 0;i < arrInt.length; i++) {
			System.out.println(arrInt[i] + " ");
		}
		System.out.println();
		//利用二分查找法查找指定的整数 
		int seaInt = Arrays.binarySearch(arrInt, search);
		if(seaInt >= 0) {
			System.out.println(search + "是数组的第" + (search + 1) + "位元素");
		}else {
			System.out.println(search + "不是数组的元素");
		}
		scan.close();  //关闭输入流
	}

}
