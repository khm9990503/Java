package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : 3단계 1번 - 구구단
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		for(int a=1;a<=9;a++) {
			
				System.out.println(N+" * "+a+" = "+(N*a));
			
			
		}
		sc.close();
	}

}
