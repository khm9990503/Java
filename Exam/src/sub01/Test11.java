package sub01;

public class Test11 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<(5-i);j++) {
				System.out.print("★");
			}
			for(int k=0;k<i;k++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println(" ");
		
		for(int a=0;a<4; a++) {
			for(int b=4-1 ; b>a ; b--) {
				System.out.print("★");
			}
				for(int b=0 ; b<a*2+1 ; b++) {
					System.out.print("☆");
				}
				for(int b=4-1 ; b>a ; b--) {
					System.out.print("★");
				}
				System.out.print("\n");
		}
	}
}
