package step06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜 : 2022/09/15
 * 이름 : 구홍모
 * 내용 : 6단계 1번 - 아스키 코드
 */
public class _01 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int i = Integer.parseInt(s);
		
		bw.write(s);
		
		bw.flush();
		bw.close();
		br.close();
	}
}
