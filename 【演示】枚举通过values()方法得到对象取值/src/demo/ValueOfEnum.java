package demo;



enum MyColor{红色,绿色,蓝色}

public class ValueOfEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyColor[] allColor = MyColor.values();
		for(MyColor aColor: allColor) {
			System.out.println(aColor);
			//遍历输出枚举数组元素和对应的编号
			System.out.println(aColor.name() + "--->" + aColor.ordinal());
		}
	}
	
	

}
