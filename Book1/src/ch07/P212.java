package ch07;

public class P212 {
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 0, 3);
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
