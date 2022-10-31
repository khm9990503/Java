package step05;

import java.util.Scanner;
/*
 * 날짜 : 2022/09/15
 * 이름 : 구홍모
 * 내용 : 5단계 3번 - 한수
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0; 
		int han = 0;
		int t = 0;
		int arr[] = new int[3];
		for(int i=1; i<=n; i++) {
			if(i>0 && i<100) {
				han=i;
			}else if(i==1000) {
				break;
			}
			k = 0;
			t = i;
			while(t>0) {
				arr[k] = t%10;
				t /= 10; k++;
			}
			if(arr[0]-arr[1]==arr[1]-arr[2]) {
				han++;
			}
		}
		System.out.println(han);
		sc.close();
	}
}
