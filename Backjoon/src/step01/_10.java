package step01;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/19
 * 이름 : 구홍모
 * 내용 : 1단계 10번 - 	킹, 퀸, 룩, 비숍, 나이트, 폰
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int L = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int P = sc.nextInt();
		
		System.out.print(1-K+" ");
		System.out.print(1-Q+" ");
		System.out.print(2-L+" ");
		System.out.print(2-B+" ");
		System.out.print(2-N+" ");
		System.out.print(8-P);
		
		sc.close();
		
	}

}
