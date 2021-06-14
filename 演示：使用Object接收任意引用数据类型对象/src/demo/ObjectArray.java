package demo;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = {1,3,5,7,9};
		Object obj = temp;

		print(obj);
	}
	
	public static void print(Object o) {
		if( o instanceof int[]) { //判断是否是整型数组
			int x[] = (int[])o;   //向下转型
			for(int i=0; i < x.length; i++) {
				System.out.print(x[i] + "\t");
			}
		}
		
	}

}
