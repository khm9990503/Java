package step03;
import java.util.Scanner;
/*
 * 날짜 : 2022/08/26
 * 이름 : 구홍모
 * 내용 : 3단계 12번 - A+B -5
 */
public class _12 {
	public static void main(String[] args) throws java.io.IOException {	
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
}