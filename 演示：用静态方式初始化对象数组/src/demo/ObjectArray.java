package demo;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p[] = {
				new Person("张三",25),
				new Person("李四",30),
				new Person("王五",35)
		};
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].talk());
		}
		
		
		
		
	}
	
}

