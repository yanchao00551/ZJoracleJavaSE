package demo;

/**
 * Բ��
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
	 * Բ�������
	 * @return
	 */
	public double periphery() {
		return PI*this.getRad()*this.wigth+PI*(this.getRad()*this.getRad())*2;
	}
	
	/**
	 * ���
	 * @return
	 */
	public double volume() {
		return wigth*PI*this.getRad();
	}
}
