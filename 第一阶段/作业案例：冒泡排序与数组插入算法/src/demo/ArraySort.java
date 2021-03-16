package demo;

public class ArraySort {
	
	/*
	 * ð���������� ����ð��  
	 * sortType  1������ 2 ����
	 */
	public static void bubbleSort(int[] arr,int sortType) {
		for (int i = 0; i < arr.length - 1; i++) {				//��ѭ��ֻ��Ҫ�Ƚ�arr.length-1�ξͿ�����
			for (int j = 0; j < arr.length - 1 - i; j++) {		//-1Ϊ�˷�ֹ����Խ��,-iΪ�����Ч��
				if(sortType == 1) {
					/*����*/
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				if(sortType == 2) {
					/*����*/
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
	 * ����ð��
	 * startIndex:��ʼλ�ã�����)
	 * endIndex:��ֹλ�ã�������
	 * sortType  1������ 2 ����
	 */
	public static void bubbleSort(int[] arr,int startIndex,int endIndex,int sortType) {
		for (int i = 0; i <= endIndex; i++) {				
			for (int j = startIndex; j <= endIndex - i - 1; j++) {		
				if(sortType == 1) {
					/*����*/
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
				if(sortType == 2) {
					/*����*/
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
