package demo;


enum MyColor {红色,绿色,蓝色};

public class EnumSwitch {
	public static void main(String[] args) {
		//定义MyColor枚举变量c1,并赋值为绿色
		MyColor c1 = MyColor.绿色;
		switch(c1) {
		case 绿色:
			System.out.println("我是绿色！");
			break;
		case 红色:
			System.out.println("我是红色！");
			break;
		case 蓝色:
			System.out.println("我是蓝色！");
			break;
		}
	}
}
