package demo;

public class Penguin extends Pet{
	private String sex;
	
	
	
	
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}




	public String getSex() {
		return sex;
	}




	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
}
