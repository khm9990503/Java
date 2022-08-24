package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 구홍모
 * 내용 : 3단계 3번 - 합
 */
public class _03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int tot=0;
		
		for (int i=1; i<=n ; i++) {
		
			tot += i;
			 
		}
		System.out.println(tot);
		sc.close();
	}

}
