package sub4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 구홍모
 * 내용 : 프로퍼티 실습하기
 * 
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\java1\\Desktop\\Fruit.properties";
		
		// 프로퍼티 파일 생성
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로퍼티 파일 생성완료...");
		
		//프로퍼티 객체 생성
		
		String target = "C:\\Users\\java1\\Desktop\\Cities.properties";
		Properties propCities = new Properties();	//빈 프로퍼티
		
		try {
			FileInputStream fis = new FileInputStream(target);
			propCities.load(fis);	// 빈 프로퍼티에 로딩
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(propCities);
		System.out.println(propCities.getProperty("Kor"));
		System.out.println(propCities.getProperty("Jpn"));
		System.out.println(propCities.getProperty("Usa"));
		System.out.println("프로퍼티 객체 생성완료...");
		
	}

}
