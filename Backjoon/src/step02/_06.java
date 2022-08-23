package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 2단계 6번 - 오븐 시계
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		
		if (((M+C)/60)>=1) {
			System.out.println((H+((M+C)/60))+" "+((M+C)%60));
			
		}else if(((M+C)/60)==0) {
			System.out.println(H+" "+((M+C)%60));
			
		}
		sc.close();		
	}

}
