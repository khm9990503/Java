package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 구홍모
 * 내용 : 4단계 2번 - 최댓값
 */
public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int[9];
		int max=arr[0];
		for(int i=0; i<9; i++) {
			
			int x = sc.nextInt();
			arr[i]=x;
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		int start = 0;
		int end   = arr.length -1;
		int loc   = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid]>max) {
				end = mid - 1;
			}else if(arr[mid]<max) {
				start = mid + 1;
			}else {
				loc = mid;
				state = true;
				break;
			}
		}
		
		
		
		sc.close();
		System.out.println(max);
		System.out.println(loc+1);
	}

}
