package demo;

/**
 *  Բ��ӿ�
 * @param rad
 * @return
 */
public interface CircleShape {
	public static final double PI = 3.141597;
	
	/**
	 * ��Բ�ܳ�
	 * @param per
	 * @return
	 */
	public abstract double perimeter();
	
	/**
	 * �������
	 * @param rad
	 * @return
	 */
	default public double area(double rad) {
		return PI*(rad*rad);
	}

}
