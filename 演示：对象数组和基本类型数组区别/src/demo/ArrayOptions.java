package demo;

import java.util.Arrays;

public class ArrayOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays of objects
		Person[] a;   //尚未初始化数组变量a
		Person[] b = new Person[5];
		
		System.out.println("b: " + Arrays.toString(b));
		
		Person[] c = new Person[4];
		for(int i=0; i<c.length; i++) {
			if(c[i] == null) 
				c[i] = new Person();
		}
	    Person[] d = {new Person(),new Person(),new Person()};
		
		a = new Person[] {
				new Person(),new Person()
		};
		
		System.out.println("a.length = " + a.length);
		System.out.println("b.length = " + b.length);
		System.out.println("c.length = " + c.length);
		System.out.println("d.length = " + d.length);
		
		a = d;
		System.out.println("a.length = " + a.length);
		
		
		int[] e;
		int[] f = new int[5];
		System.out.println("f: " + Arrays.toString(f));
		int[] g = new int[4];
		for(int i=0; i<g.length; i++) {
			g[i] = i * i;
		}
		int[] h = {11,47,93};
		System.out.println("f.length:" + f.length);
		
		
		
		
		
		
	}

}
