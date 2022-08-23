package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 2단계 5번 - 알람 시계
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M>=45 && H>=1) {
			System.out.println(H+" "+(M-45));
			
		}else if(M<45 && H>=1){
			System.out.println((H-1)+" "+(60+(M-45)));
			
		}else if(M<45 && H==0){
			System.out.println("23 "+(60+(M-45)));
		
		}else if(M>=45 && H==0){
			System.out.println("0 "+(M-45));
			
		}
		sc.close();
	}

}
