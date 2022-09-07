package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/03
 * 이름 : 구홍모
 * 내용 : 4단계 4번 - 평균
 */
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		double arr2[]= new double[n];
		int m = 0;
		double sum = 0;
		double c = (double)n;
		
		
		for(int i=0;i<n;i++) {
			int s = sc.nextInt();
			arr[i]=s;
			
		}
		
		for(int j=0;j<n;j++) {
			if(m<arr[j]) {
				m=arr[j];
			}
		}
		
		for(int k=0;k<n;k++) {
			arr2[k]=(double)(arr[k])/m*100;
			sum+=(double)arr2[k];
		}
		double avg = (double)sum/c;
		
		System.out.println(avg);
		sc.close();
	}

}
