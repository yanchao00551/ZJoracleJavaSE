package demo;

/**
 *  圆类接口
 * @param rad
 * @return
 */
public interface CircleShape {
	public static final double PI = 3.141597;
	
	/**
	 * 求圆周长
	 * @param per
	 * @return
	 */
	public abstract double perimeter();
	
	/**
	 * 计算面积
	 * @param rad
	 * @return
	 */
	default public double area(double rad) {
		return PI*(rad*rad);
	}

}
