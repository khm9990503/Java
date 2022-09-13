package sub1;

import java.io.*;

/*
 * 날짜 : 2022/09/13
 * 이름 : 구홍모
 * 내용 : 파일 입출력 스트림 실습하기
 * 
 * 파일 입출력(IO)
 * - 파일(file)은 컴퓨터 저장매체에 저장되는 데이터 활용
 * - 프로그램은 데이터 처리와 함께 저장하기 위해 파일 입출력을 수행
 * - 파일 입출력을 위해 스트림(stream)을 연결해야 됨
 * 
 * 
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java1\\Desktop\\Sample2.txt";
		
		
		try {
			FileInputStream fis = new FileInputStream(path); // 파일이 없을 수 있을 경우 에러 예외처리 필요
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				
				int value = fis.read();		// IOException 예외처리 필요
				
				if(value==-1) {		// value==-1 : 파일을 더이상 읽을 것이 없다.
					break;
				}
				
				//char c = (char) value;
				//System.out.print(c);
				
				fos.write(value);
				
			}
			
			fis.close(); // 스트림 해제
			fos.close(); // 쓰기 완료
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
