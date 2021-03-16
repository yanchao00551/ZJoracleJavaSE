enum MyColor {ºìÉ«,ÂÌÉ«,À¶É«};
public class ValueOfEnum {
	public static void main(String[] args) {
		MyColor[] c1 = MyColor.values();
		for(MyColor aColor:c1) {
			System.out.println(aColor);
		}
	}
}