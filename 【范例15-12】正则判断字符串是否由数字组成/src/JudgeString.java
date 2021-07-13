
public class JudgeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if("123".matches("\\d+")) {
			System.out.println("由数字组成");
		}else {
			System.out.println("不是由数字组成");
		}
	}

}
