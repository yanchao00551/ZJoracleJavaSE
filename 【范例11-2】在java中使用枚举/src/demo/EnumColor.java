package demo;

enum MyColor {红色,绿色,蓝色};
public class EnumColor {
	public static void main(String[] args) {
		MyColor c1 = MyColor.红色; //获得红色
		System.out.println(c1);
		
		//获得绿色
		MyColor c2 = MyColor.绿色;
		System.out.println(c2);
		
		//获得蓝色
		MyColor c3 = MyColor.蓝色;
		System.out.println(c3);
	}
}
