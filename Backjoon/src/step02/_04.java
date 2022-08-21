package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 구홍모
 * 내용 : 2단계 4번 - 사분면 고르기
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}
		sc.close();
	}
	

}
