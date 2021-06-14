package demo;

public class Interfacestandards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		com.plugin(new Print());
		com.plugin(new Flash());
	}

}
