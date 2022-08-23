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
		
		for(int i=1;i<=5;i++) {
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(i==5) {
			System.out.println(A+B);
		}
		
		}
		
	}

}
