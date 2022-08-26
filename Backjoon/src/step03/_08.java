package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 구홍모
 * 내용 : 3단계 8번 - 별 찍기-1
 */
public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
		
				
	
	}

}
