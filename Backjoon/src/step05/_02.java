package step05;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 날짜 : 2022/09/15
 * 이름 : 구홍모
 * 내용 : 5단계 2번 - 셀프 넘버
 */
public class _02 {

	public static void main(String[] args) {
		
		int i, n, sum;
		String array[] = new String[10000];
		for(i = 0; i < array.length; i++) { 
			array[i] = Integer.toString(i+1); }
		ArrayList<String>numbers = new ArrayList<>(Arrays.asList(array));
		
		for(i = 0; i < array.length; i++) {
			n = i + 1; sum = n;
			while(n > 0) {
				sum += n % 10;
				n = n / 10;
			}
			String num = Integer.toString(sum);
			numbers.remove(num);
		}
		
		for(String s : numbers) { System.out.println(s); }
	}
}
