package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 구홍모
 * 내용 : 2단계 2번 - 시험성적
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(score>=80) {
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		sc.close();
	}

}
