package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		double rad = 0;
		double wigth = 0;
		//����̨����
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try {
			System.out.println("������Բ�뾶��");
			String str = bufin.readLine();
			rad = Double.valueOf(str);
			System.out.println("������Բ���ߣ�");
			str = bufin.readLine();
			wigth = Double.valueOf(str);
			
			CircleShape cir = new Circle(rad);
			System.out.println("Բ�����"+cir.area(rad));
			System.out.println("Բ�ܳ���"+cir.perimeter());
			
			Cylinder cir1 = new Cylinder(rad,wigth);
			System.out.println("Բ���������"+cir1.area(rad));
			System.out.println("Բ���������"+cir1.periphery());
			System.out.println("�����"+cir1.volume());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("����I/O����");
			e.printStackTrace();
		}
		
		
		
	}
}
