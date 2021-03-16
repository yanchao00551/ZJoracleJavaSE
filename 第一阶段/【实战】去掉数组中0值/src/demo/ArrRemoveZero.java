package demo;

public class ArrRemoveZero {
	public static void main(String[] args) {
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int num = 0;
		for(int i:oldArr) {
			if(i != 0) {
				num++;
			}
		}
		int[] newArr = new int[num];
	
		int j = 0;
		for(int z=0;z<oldArr.length;z++) {
			if(oldArr[z] != 0) {
				newArr[j] = oldArr[z];
				j++;
			}
		}
		
		for(int p:newArr) {
			System.out.println(p);
		}
	}
}
