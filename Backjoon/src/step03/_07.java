package step03;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 3단계 7번 - A+B-8
 */
public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		int arrA[] = new int[T];
		int arrB[] = new int[T];
		
		for(int j=0;j<T;j++) {
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		arrA[j] = A;
		arrB[j] = B;
		arr[j] = A+B;
		}
		
		
		for(int r=0;r<arr.length;r++) {
			System.out.println("Case #"+(r+1)+": "+arrA[r]+" + "+arrB[r]+" = "+arr[r]);
		}
		sc.close();
	}

}