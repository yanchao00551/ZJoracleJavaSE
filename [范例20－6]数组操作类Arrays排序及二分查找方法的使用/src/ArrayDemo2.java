import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrInt[] = {17,40,12,6,15,16,8,10,18,50};
		//������������arrInt
		Arrays.sort(arrInt);
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�������");
		int search = scan.nextInt();
		//�������������
		for(int i = 0;i < arrInt.length; i++) {
			System.out.println(arrInt[i] + " ");
		}
		System.out.println();
		//���ö��ֲ��ҷ�����ָ�������� 
		int seaInt = Arrays.binarySearch(arrInt, search);
		if(seaInt >= 0) {
			System.out.println(search + "������ĵ�" + (search + 1) + "λԪ��");
		}else {
			System.out.println(search + "���������Ԫ��");
		}
		scan.close();  //�ر�������
	}

}
