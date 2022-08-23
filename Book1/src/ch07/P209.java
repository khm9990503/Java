package ch07;

public class P209 {
	public static void main(String[] args) {
		P207[] Library = new P207[5];
		
		Library[0] = new P207("태백산맥", "조정래");
		Library[1] = new P207("데미안", "헤르만 헤세");
		Library[2] = new P207("어떻게 살 것인가", "유시민");
		Library[3] = new P207("토지", "박경리");
		Library[4] = new P207("어린왕자", "생텍쥐페리");
		
		for(int i=0; i<Library.length;i++) {
			Library[i].showBookInfo();
		}
		for(int i=0; i<Library.length;i++) {
			System.out.println(Library[i]);
		}
	}

}
