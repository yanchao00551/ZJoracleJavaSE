package demo;


enum MyColor {��ɫ,��ɫ,��ɫ};

public class EnumSwitch {
	public static void main(String[] args) {
		//����MyColorö�ٱ���c1,����ֵΪ��ɫ
		MyColor c1 = MyColor.��ɫ;
		switch(c1) {
		case ��ɫ:
			System.out.println("������ɫ��");
			break;
		case ��ɫ:
			System.out.println("���Ǻ�ɫ��");
			break;
		case ��ɫ:
			System.out.println("������ɫ��");
			break;
		}
	}
}
