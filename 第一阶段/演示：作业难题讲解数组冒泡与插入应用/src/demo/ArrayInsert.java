package demo;


/*
 * ����Ĳ�����
 */
public class ArrayInsert {
	
	/*
	 * ������λ
	 * arr ��������
	 * index ��λ��ʼ�±�
	 * num  ��λ��
	 */
	public static void arrInsert(int[] arr,int index,int num) {
		for(int j = arr.length -1 ; j>= index+num; j--) {
			if(index == Config.A.length) {
				arr[j] = arr[j - num + 1];
			}else {
				arr[j] = arr[j - num];
			}
		}
	}
	
	/*
	 * �����㷨  �ƶ�1��λ��
	 */
	public static void arrInsert(int[] arr,int index) {
		for(int j = arr.length; j < index; j--) {
			arr[j] = arr[j - 1];
		}
	}
	
	
	/*
	 * ������a��ָ���������ݸ�ֵ������b
	 * a[] 
	 * b[]
	 * len ָ������
	 * index  ָ�����ĸ��±꿪ʼ
	 * 
	 * ��  �β� indexΪ 7  ��ʱ��  ��ʼλ�ã�  �������λ�� ��������a�� ������������Խ��  b[i] = a[7]
	 */
	public static void arrToDetails(int a[],int[] b,int len,int index) {
		for(int i=index; i < len; i++) {
			b[i] = a[i];
		}
	}
	
	/*
	 * ������a��ָ���������ݸ�ֵ������b   ����ֲ�����
	 * a �滻����
	 * b ԭʼ����
	 * len ����
	 * index ��ʼλ��
	 * n  �±겻һ������£�����n�±�Ϊ����a���±�
	 */
	public static void arrToDetails(int a[],int[] b,int len,int index,int n) {
		for(int i=index; i <= len; i++) {
			b[i] = a[n];
			n++;
		}
	}
}
