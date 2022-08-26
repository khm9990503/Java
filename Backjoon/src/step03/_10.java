package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 구홍모
 * 내용 : 3단계 10번 - x보다 작은 수
 */
public class _10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			int L = sc.nextInt();
			Arr[i]=L;
		}
		for(int k=0;k<Arr.length;k++) {
			if(Arr[k]<X) {
				System.out.print(Arr[k]+" ");
			}
			sc.close();
		}
				
	}

}
