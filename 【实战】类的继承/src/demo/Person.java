package demo;

public class Person {
	
	private String name;
	private String addr;
	private String sex;
	private Integer age;
	public Person() {
		
	}
	
	public Person(String name, String addr, String sex, Integer age) {
		super();
		this.name = name;
		this.addr = addr;
		this.sex = sex;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void talk() {
		System.out.println("name:"+this.name+"address:"+addr+"sex:"+sex+"age"+age);
	}
}
