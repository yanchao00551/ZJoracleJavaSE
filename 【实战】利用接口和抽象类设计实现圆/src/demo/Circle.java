package demo;

/**
 * 圆形类
 * @author 10947
 *
 */
public class Circle implements CircleShape {
	private double rad;
	public Circle(double rad) {
		this.rad = rad;
	}

	/**
	 * 周长
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return PI*(this.rad*2);
	}
	
	public double getRad() {
		return this.rad;
	}

}
