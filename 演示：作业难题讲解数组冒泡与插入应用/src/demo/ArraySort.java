package demo;

/*
 * 数组操作类（含排序常用数组操作算法)
 */
public class ArraySort {
	/*
	 *  冒泡排序 经典冒泡
     * 1,返回值类型,void
     * 2,参数列表,int[] arr
     * sortType 1、升序  2、降序
	 */
	public static void bubbleSort(int[] arr,int sortType) {
		for (int i = 0; i < arr.length - 1; i++) {				//外循环只需要比较arr.length-1次就可以了
			for (int j = 0; j < arr.length - 1 - i; j++) {		//-1为了防止索引越界,-i为了提高效率
				/*升序*/
				if(sortType == 1) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				
				/*降序*/
				if(sortType == 2) {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
			}
		}
	}
	
	/*
	 * 变种冒泡  局部升序和降序
	 * startIndex :起使位置(包含)
	 * endIndex: 终止位置(包含)
	 * sortType:  1、 升序  2、降序
	 */
	public static void bubbleSort(int[] arr,int startIndex,int endIndex,int sortType) {
		for (int i = 0; i <= endIndex; i++) {				//外循环只需要比较arr.length-1次就可以了
			for (int j = startIndex; j <= endIndex - 1 - i; j++) {		//-1为了防止索引越界,-i为了提高效率
				/*升序*/
				if(sortType == 1) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				
				/*降序*/
				if(sortType == 2) {
					if(arr[j] < arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
			}
		}
	}
}
