package demo;

public class TestValue01 {
	public static void change(int[] count) {
		count[0] = 0;
		System.out.println("�ڷ����ڲ�count[0] = " + count[0]); //0
	}

	public static void main(String[] args) {
		int[] count = {1,2,3,4,5};
		System.out.println("����ִ��ǰcount[0] = " + count[0]);  //1
		change(count);     //����change����
		System.out.println("����ִ�к�count[0] = " + count[0]);  //0
		
	}
}
