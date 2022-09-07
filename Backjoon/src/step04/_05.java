package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 구홍모
 * 내용 : 4단계 5번 - OX퀴즈
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		int scr[]=new int[n];
		for(int i=0;i<n;i++) {
			int score = 0;
			int cnt = 0;
			
			String Q = sc.nextLine();
			String arr[]= Q.split("");
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals("O")) {
					cnt++;
					score += cnt;
				}else {
					cnt=0;
				}
				
			}
			scr[i]=score;
		}
		for(int k=0;k<n;k++) {
			System.out.println(scr[k]);
		}
		sc.close();
	}
	
}
