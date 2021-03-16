package demo;

/**
 * 狗狗类，宠物的子类
 * @author 10947
 *
 */
public class Dog extends Pet{
	 private String strain;

	public Dog(String strain,String name) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("这是重写的方法！！！");
	}
	
	
	 
	 
	 
}
