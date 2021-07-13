
public class BooleanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "true";
		boolean flag = Boolean.parseBoolean(str);
		if(flag) {
			System.out.println("条件满足！");
		}else {
			System.out.println("条件不满足！");
		}
	}

}
