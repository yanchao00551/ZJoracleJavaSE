package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 
 * 
 */

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("welcome");
		al.add("to");
		al.add("tianyan");
		Iterator<String> itr = al.iterator();
	    while(itr.hasNext()) {
	    	Object elment = itr.next();
	    	System.out.print(elment + "\t"); //×ª»»String
	    }
		
	}

}
