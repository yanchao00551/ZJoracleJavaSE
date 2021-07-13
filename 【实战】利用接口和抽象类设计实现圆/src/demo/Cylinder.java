package demo;

/**
 * 圆柱
 * @author 10947
 *
 */
public class Cylinder extends Circle implements CircleShape{
	private double wigth;
	public Cylinder(double rad,double wigth) {
		super(rad);
		// TODO Auto-generated constructor stub
		this.wigth = wigth;
	}
	
	/**
	 * 圆柱表面积
	 * @return
	 */
	public double periphery() {
		return PI*this.getRad()*this.wigth+PI*(this.getRad()*this.getRad())*2;
	}
	
	/**
	 * 体积
	 * @return
	 */
	public double volume() {
		return wigth*PI*this.getRad();
	}
}
