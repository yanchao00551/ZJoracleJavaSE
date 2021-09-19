package demo;

public class Dog {
	//киоо
	private String strain;

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
