package demo;

public class ClassTestRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = null;  //��������p1 ,�˶���ֵΪnull,δʵ����
		Person p2 = null;
		p1 = new Person();
		p1.age = 20;
		p1.name = "����";
		p2 = p1;    //��p1�����ø���p2
		System.out.println("������" + p2.name);   //����
		System.out.println("���䣺" + p2.age);     //20
	}

}
