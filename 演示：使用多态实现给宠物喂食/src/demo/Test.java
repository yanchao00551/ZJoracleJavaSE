package demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("ŷŷ", "ѩ����");
		Penguin pgn = new Penguin("��", "Q��");
		Cat cat=new Cat("Tomcat","��ɫ");
		dog.setHealth(80); //���ý���ֵ���Ա�����ιʳ
		pgn.setHealth(80); //���ý���ֵ���Ա�����ιʳ
		cat.setHealth(80); //���ý���ֵ���Ա�����ιʳ
		Master master=new Master("������",100);
		master.feed(dog);//���˸�����ιʳ
		master.feed(pgn);//���˸����ιʳ
		master.feed(cat);//���˸�èιʳ
	}

}
