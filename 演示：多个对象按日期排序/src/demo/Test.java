package demo;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person = new Person[] {
				new Person("��xx","��","2010-1-10 22:22"),
				new Person("��xx","��","2010-5-1 10:11"),
				new Person("��xx","��","2010-3-22 21:11"),
				new Person("��xx","Ů","2010-3-22 20:09")
		};
		Arrays.sort(person, new PersonComparator());
		
		System.out.println(Arrays.toString(person));
	}

}
