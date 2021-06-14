package demo;

class Person {
	String name;
	
	public Person() {
		System.out.println("new Person()");
	}
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	} 
	
	
}
