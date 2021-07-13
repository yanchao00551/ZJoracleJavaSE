package demo;

/*
 * 数据配置类
 * 
 */
public class Config {
	public static final int[] A = new int[] {7,9,13,1,15,11,17,19};  //数组A
	public static final int NUMBER = 12;    //数组固定扩容长度
	public static int[] C = new int[A.length + NUMBER];    //数组C  利用构造方法进行初始化
	
	
	
	/*
	 *初始化数组C  构造方法
	 */
	public Config() {
		ArrayInsert.arrToDetails(A, C, A.length, 0);
	}
}
