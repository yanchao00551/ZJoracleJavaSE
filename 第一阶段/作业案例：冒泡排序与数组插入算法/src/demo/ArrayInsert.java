package demo;


public class ArrayInsert {
	

	/*
	 * �����㷨 �ƶ�ָ��λ��
	 * arr ����������
	 * index ������ʼλ���±�
	 * num ����λ��
	 */
	public static void arrInsert(int[] arr,int index,int num) {
		for(int j = arr.length-1;j >= index + num; j--) {
			arr[j] = arr[j - num];
		}
	}
	
	
	/*
	 * �����㷨 �ƶ�1��λ��
	 */
	public static void arrInsert(int[] arr,int index) {
		for(int j = arr.length;j < index; j--) {
			arr[j] = arr[arr.length - 1];
		}
	}
	
	/*
	 * ������a��ָ���������ݸ�ֵ������b 
	 * len ����
	 * index ��ʼλ��
	 * 
	 * 
	 */
	public static void arrToDetails(int[] a ,int[] b,int len,int index) {
		for(int i=index; i<len; i++) {
			b[i] = a[i];
		}
	}
	
	/*
	 * ������a��ָ���������ݸ�ֵ������b ����ֲ�����  
	 * len ����
	 * index ��ʼλ��
	 * n �±겻һ������� ����n�±�Ϊ����a���±�
	 */
	public static void arrToDetails(int[] a ,int[] b,int len,int index,int n) {
		for(int i=index; i<=len; i++) {
			b[i] = a[n];
			n++;
		}
	}
	
	
	

	
	
}
