package demo;

/*
 * ����������
 */
public class Config {
	public static final int[] A = new int[] {7,9,13,1,15,11,17,19};  //����A
	public static final int NUMBER = 5;  //����̶����ݳ���
	public int[] C = new int[A.length + NUMBER];  //����C
	
	/*
	 * ��ʼ������C
	 */
	public Config() {
		ArrayInsert.arrToDetails(A, C, A.length,0);
	}
}
