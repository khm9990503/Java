package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 3단계 2번 - A+B
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		
		for(int j=0;j<T;j++) {
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		arr[j] = A+B;
		}
		
		
		for(int result : arr) {
			System.out.println(result);
		}
		sc.close();
	}

}
