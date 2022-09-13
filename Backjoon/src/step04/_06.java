package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/08
 * 이름 : 구홍모
 * 내용 : 4단계 6번 - 평균은 넘겠지
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		double arr[] = new double[N];
		
		
		
		for(int i=0;i<N;i++ ) {
			int c = sc.nextInt();
			int arr1[] = new int[c];
			int sum=0;
			int count = 0;
			
			for(int j=0;j<c;j++) {
				int g = sc.nextInt();
				arr1[j]=g;
				sum+=arr1[j];
			}
			
			for(int k=0;k<c;k++) {
				double avg= (double)sum/(double)c;
				if(avg<(double)arr1[k]) {
					count++;
				}
			}
			
			arr[i]=(double)count/(double)c*100;
			
		}
		
		for(int l=0;l<N;l++) {
			System.out.println(String.format("%.3f",arr[l])+"%");
		}
		sc.close();
	}

}
