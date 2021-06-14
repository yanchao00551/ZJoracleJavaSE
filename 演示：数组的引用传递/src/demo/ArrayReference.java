package demo;

public class ArrayReference {
	
	
	
	
	
	public static void changeReferValue(int a,int[] myArr) {
		a += 1;
		
		myArr[0] = 0;    //将数组3个元素赋值0
		myArr[1] = 0;
		myArr[2] = 0;
		
	}
	
	
	//打印数组元素
	public static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	//打印结果
	public static void print(int in,int[] arr) {
		System.out.println("in: " + in);
		System.out.print("arr: ");
		printArr(arr);
	}
	
	public static void main(String[] args) {
		int in = 10;
		int arr[] = {1,2,3,4,5};
		
		System.out.println("---调用changeReferValue方法之前-----");
		print(in,arr);
		
		changeReferValue(in,arr);
		System.out.println("---调用changeReferValue方法之后------");
		print(in,arr);
		
	}
}
