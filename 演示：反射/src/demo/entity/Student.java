package demo.entity;

public class Student {
	//---------------���췽��-------------------
		//��Ĭ�ϵĹ��췽����
		Student(String str){
			System.out.println("(Ĭ��)�Ĺ��췽�� s = " + str);
		}
		//�޲ι��췽��
		public Student(){
			System.out.println("�����˹��С��޲ι��췽��ִ���ˡ�����");
		}
		//��һ�������Ĺ��췽��
		public Student(char name){
			System.out.println("������" + name);
		}
		//�ж�������Ĺ��췽��
		public Student(String name ,int age){
			System.out.println("������"+name+"���䣺"+ age);//���ִ��Ч�������⣬�Ժ�����
		}
		//�ܱ����Ĺ��췽��
		protected Student(boolean n){
			System.out.println("�ܱ����Ĺ��췽�� n = " + n);
		}
		//˽�й��췽��
		private Student(int age){
			System.out.println("˽�еĹ��췽��   ���䣺"+ age);
		}
}
