package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 구홍모
 * 내용 : 3단계 9번 - 별 찍기-2
 */
public class _09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			for(int j=0;j<(T-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
				
			}
			System.out.println();
			sc.close();
		}
	}

}
