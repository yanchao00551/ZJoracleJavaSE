package demo;

import java.util.Comparator;

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int flag = o1.getDate().compareTo(o2.getDate());
		return flag;
	}
	

}
