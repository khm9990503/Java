package sub1;

import java.io.*;

/*
 * 날짜 : 2022/09/13
 * 이름 : 구홍모
 * 내용 : 문자 스트림 실습하기
 * 
 */

public class ReaderTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		
		
		
		try {
			FileReader fr = new FileReader(path); // 파일이 없을 수 있을 경우 에러 예외처리 필요
													// 영어를 제외한 다른 언어를 읽을 시 문자 스트림 사용 
			
			
			while(true) {
				
				int value = fr.read();		// IOException 예외처리 필요
				
				if(value==-1) {		// value==-1 : 파일을 더이상 읽을 것이 없다.
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
				
				
				
			}
			
			fr.close(); // 스트림 해제
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
