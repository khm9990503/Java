package step01;
import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 구홍모
 * 내용 : 1단계 12번 - 곱셈
 */
public class _12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B/10)%10));
		System.out.println(A*((B/100)%10));
		System.out.println(A*B);
		
		sc.close();
	}

}
