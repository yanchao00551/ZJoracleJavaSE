
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a1b22c333d444e55555f666666g";
		String regex = "[0-9]+";  //数字出现1次或多次
//		String regex1 = "\\d+";  
		System.out.println(str.replaceAll(regex, ""));
	}

}
