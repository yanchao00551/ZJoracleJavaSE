package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		double rad = 0;
		double wigth = 0;
		//控制台输入
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try {
			System.out.println("请输入圆半径：");
			String str = bufin.readLine();
			rad = Double.valueOf(str);
			System.out.println("请输入圆柱高：");
			str = bufin.readLine();
			wigth = Double.valueOf(str);
			
			CircleShape cir = new Circle(rad);
			System.out.println("圆面积："+cir.area(rad));
			System.out.println("圆周长："+cir.perimeter());
			
			Cylinder cir1 = new Cylinder(rad,wigth);
			System.out.println("圆柱底面积："+cir1.area(rad));
			System.out.println("圆柱表面积："+cir1.periphery());
			System.out.println("体积："+cir1.volume());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("发生I/O错误");
			e.printStackTrace();
		}
		
		
		
	}
}
