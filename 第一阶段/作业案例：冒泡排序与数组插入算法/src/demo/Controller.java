package demo;

import java.util.Arrays;

/*
 * ³ÌÐò¿ØÖÆÆ÷Àà
 */
public class Controller extends Config{
	public void start() {
		int[] b = User.inputArr();
		ArraySort.bubbleSort(b, 1);
		int index = User.inputIndex();
		ArrayInsert.arrInsert(C, index, NUMBER);
		ArrayInsert.arrToDetails(b, C, index + NUMBER - 1, index,0);
		ArraySort.bubbleSort(C, 0, index-1, 2);
		ArraySort.bubbleSort(C, index + NUMBER, C.length-1, 1);
		System.out.println(Arrays.toString(C));
		System.out.println(index+NUMBER);
		System.out.println(C.length-1);
		
		
		
//		int[] a = new int[] {13, 9, 7, 2, 4, 6, 8, 10, 1, 15, 11, 17, 19};
//		ArraySort.bubbleSort(a, 8, 12, 2);
//		System.out.println(Arrays.toString(a));
//		System.out.println(index+NUMBER);
//		System.out.println(C.length-1);


		
	}
}
