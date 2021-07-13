
public class StringArray {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str = "hellojava";
//		char data[] = str.toCharArray();
//		for(int i=0;i<data.length;i++) {
//			System.out.print(data[i]+"、");
//			data[i] -= 32;  //小写变为大写
//		}
//		System.out.println();
//		System.out.println("将全部字符数组变为字符串："+new String(data));
//		//取得部分内容的时候需要设置起始点和取得的长度
//		System.out.println("将部分字符数组变为字符串："+new String(data,5,4));
		String a = "ab";
		String b = "a" + "b";
		System.out.println(a == b);
		
		String a1 = "ab";
		String b1 = "cd";
		String c = "abcd";
		String d = a1 + b1;
		
		System.out.println(c.equals(d));
	}

}
