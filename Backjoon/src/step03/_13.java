package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/30
 * 이름 : 구홍모
 * 내용 : 3단계 13번 - 더하기 사이클
 */
public class _13 {
	
		public static void main(String[] args) {	
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = (n/10+n%10)%10;
			int r = x+((n%10)*10);
			int c = 0;
			while(true) {
				if(n==r) {
					c++;
					break;
				}
				c++;
			
				
			}
			
		}
}
