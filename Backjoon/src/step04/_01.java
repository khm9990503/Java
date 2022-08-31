package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/31
 * 이름 : 구홍모
 * 내용 : 4단계 1번 - 최소, 최대
 */
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int Max = arr[0];
		int Min = arr[0];
		
		for(int i=0 ; i<N ; i++) {
			
			int A = sc.nextInt();
			arr[i] = A; 
			
			if(Max<arr[i]) {
				Max=arr[i];
			}
			if(Min>arr[i]) {
				Min=arr[i];
			}
		}
		
		System.out.println(Min+" "+Max);
		
		sc.close();
	}

}
