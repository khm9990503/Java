package step03;
/*
 * 날짜 : 2022/08/24
 * 이름 : 구홍모
 * 내용 : 3단계 4번 - 영수증
 */
import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int total = sc.nextInt();
		int N = sc.nextInt();
		int arr[]=new int[N];
		int tot = 0;
		
		for(int i=0;i<N;i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i]=a*b;
			
		}
		
		for(int j=0;j<N;j++) {
			tot += arr[j];
		}
		if(total == tot) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
