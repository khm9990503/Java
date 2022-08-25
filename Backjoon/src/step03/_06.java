package step03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/08/25
 * 이름 : 구홍모
 * 내용 : 3단계 6번 - A+B-7
 */
public class _06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
		
	}

}