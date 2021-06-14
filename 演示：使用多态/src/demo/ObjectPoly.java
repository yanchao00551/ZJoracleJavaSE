package demo;

public class ObjectPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		Fish f = new Fish();
		Bird b = new Bird();
		Horse h = new Horse();
		
		a = f;
		a.move();  //鱼儿游
		
		a = b;
		a.move();  //鸟儿飞
		
		a = h;
		a.move();   //马儿跑
		
		
	}

}
