package demo;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"hello","world"};  //arr.length 
		
		List<String> all = Arrays.asList("Hello","World","ÄãºÃ","ÊÀ½ç");
		for(String s:all) {
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(arr));
		
		String s = Arrays.toString(arr);
		System.out.println( s.substring(1, arr.length)); 
	}

}
