package ch07;

public class P213 {
	public static void main(String[] args) {
		P207[] bookArray1 = new P207[3];
		P207[] bookArray2 = new P207[3];
		
		bookArray1[0]= new P207("태백산맥","조정래");
		bookArray1[1]= new P207("데미안","헤르만 헤세");
		bookArray1[2]= new P207("어떻게 살 것인가","유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
