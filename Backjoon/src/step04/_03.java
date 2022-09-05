package step04;

import java.util.Scanner;
import java.util.Arrays;
/*
 * 날짜 : 2022/09/02
 * 이름 : 구홍모
 * 내용 : 4단계 3번 - 나머지
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int arr[]= new int[10];
		
		for (int i = 0; i<10 ; i++) {
			int x = sc.nextInt();
			arr[i]=x%42;
		}
		int[] resultArr = Arrays.stream(arr).distinct().toArray();

		System.out.println(resultArr.length);
		sc.close();
	}

}
