package demo.entity;

public class Teacher {
	
		public String name;
		protected int age;
		char sex;
		private String phoneNum;
		
		public Teacher() {
			
		}
		
		
		//**************��Ա����***************//
		public void show1(String s){
			System.out.println("�����ˣ����еģ�String������show1(): s = " + s);
		}
		protected void show2(){
			System.out.println("�����ˣ��ܱ����ģ��޲ε�show2()");
		}
		void show3(){
			System.out.println("�����ˣ�Ĭ�ϵģ��޲ε�show3()");
		}
		private String show4(int age){
			System.out.println("�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = " + age);
			return "abcd";
		}

		
		@Override
		public String toString() {
			return "Teacher [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNum=" + phoneNum + "]";
		}

		
}
