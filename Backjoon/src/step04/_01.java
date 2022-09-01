package step04;

import java.util.*;
import java.io.*;

/*
 * 날짜 : 2022/08/31
 * 이름 : 구홍모
 * 내용 : 4단계 1번 - 최소, 최대
 */
public class _01 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			StringTokenizer stk = new StringTokenizer(br.readLine());
			br.close();

			int max = Integer.parseInt(stk.nextToken());
			int min = max;
			

			for(int i = 0; i < n - 1; i++) {
				int temp = Integer.parseInt(stk.nextToken());
				if(temp > max) {
					max = temp;
				} else if(temp < min) {
					min = temp;
				} else {
					continue;
				}
			}
	       
			 
				System.out.println(min + " " + max);
			
		}
	}
