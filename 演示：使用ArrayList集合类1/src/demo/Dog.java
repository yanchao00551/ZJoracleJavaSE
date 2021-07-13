package demo;

public class Dog {
	private String strain;    //киоо

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]";
	}

	
}
