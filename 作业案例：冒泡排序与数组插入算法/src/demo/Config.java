package demo;

/*
 * 数据配置类
 */
public class Config {
	public static final int[] A = new int[] {7,9,13,1,15,11,17,19};  //数组A
	public static final int NUMBER = 5;  //数组固定扩容长度
	public int[] C = new int[A.length + NUMBER];  //数组C
	
	/*
	 * 初始化数组C
	 */
	public Config() {
		ArrayInsert.arrToDetails(A, C, A.length,0);
	}
}
