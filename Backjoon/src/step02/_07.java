package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 2단계 7번 - 주사위 세개
 */
public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		
		if (A==B && B==C) {
			System.out.println(10000+A*1000);
			
		}else if (A==B || B==C || A==C) {
			if(A==B) {System.out.println(1000+A*100);}
			if(B==C) {System.out.println(1000+B*100);}
			if(A==C) {System.out.println(1000+C*100);}
		}else {
			if(A>B && A>C) {System.out.println(A*100);}
			if(B>A && B>C) {System.out.println(B*100);}
			if(C>A && C>B) {System.out.println(C*100);}
		}
		sc.close();
	}

}
