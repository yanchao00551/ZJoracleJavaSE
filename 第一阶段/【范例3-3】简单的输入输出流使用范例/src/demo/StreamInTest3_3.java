package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamInTest3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try {
			System.out.println("�������ַ���");
			str = bufin.readLine();
			System.out.println("��������ַ�Ϊ��"+str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("����I/O����");
			e.printStackTrace();
		}
	}

}
