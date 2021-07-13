package demo;

public class ArraySort {
	
	/*
	 * 冒泡排序所有 经典冒泡  
	 * sortType  1、升序、 2 降序
	 */
	public static void bubbleSort(int[] arr,int sortType) {
		for (int i = 0; i < arr.length - 1; i++) {				//外循环只需要比较arr.length-1次就可以了
			for (int j = 0; j < arr.length - 1 - i; j++) {		//-1为了防止索引越界,-i为了提高效率
				if(sortType == 1) {
					/*升序*/
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				if(sortType == 2) {
					/*降序*/
					if(arr[j]<arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
				
			}
		}
	} 
	
	
	/*
	 * 变种冒泡
	 * startIndex:起始位置（包含)
	 * endIndex:终止位置（包含）
	 * sortType  1、升序、 2 降序
	 */
	public static void bubbleSort(int[] arr,int startIndex,int endIndex,int sortType) {
		for (int i = 0; i <= endIndex; i++) {				
			for (int j = startIndex; j <= endIndex - i - 1; j++) {		
				if(sortType == 1) {
					/*升序*/
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				if(sortType == 2) {
					/*降序*/
					if(arr[j]<arr[j+1]){
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
	} 
	
	
}
