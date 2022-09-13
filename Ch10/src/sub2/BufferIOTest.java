package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 구홍모
 * 내용 : 보조 스트림 실습하기
 * 
 * 버퍼 스트림
 * - 기본 입출력에 Buffer를 추가해서 빠른 입출력을 지원하는 스트림
 * - 기본 입출력에 무조건 장착해야 실행 성능 향상
 */
public class BufferIOTest {
	public static void main(String[] args) { // catch에서 안 쓰고 throw 가능
		
		String path = "C:\\Users\\java1\\Desktop\\Java.pdf";
		String target = "C:\\Users\\java1\\Desktop\\Java2.pdf";
		
		try {
			FileInputStream fis = new FileInputStream(path); // 파일이 없을 수 있을 경우 에러 예외처리 필요
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림(Buffer) 생성 연결
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				
				int value = bis.read();		// IOException 예외처리 필요
				
				if(value == -1) {		// value==-1 : 파일을 더이상 읽을 것이 없다.
					break;
				}
				
				//char c = (char) value;
				//System.out.print(c);
				
				bos.write(value);
				
			}
			
			bis.close(); // 버퍼 먼저 벗기기
			bos.close();
			fis.close(); // 스트림 해제
			fos.close(); // 쓰기 완료
			
			
			System.out.println("쓰기 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}

}
