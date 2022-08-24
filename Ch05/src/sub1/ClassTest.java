package sub1;
/*
 * 날짜 : 2022/08/24
 * 이름 : 구홍모
 * 내용 : Java 클레스 객체 실습하기
 * 
 * 클레스와 객체
 *  - 클레스는 객체를 생성하는 구조체이고 속성(필드)과 기능(메서드)으로 구성
 *  - 객체는 클레스의 실제 인스턴스이며 new 연산으로 생성
 * 
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car Sonata = new Car();			//Car는 참조변수 = 객체
		
		Sonata.name = "소나타";
		Sonata.color = "흰색";
		Sonata.speed = 0;
		
		// 객체 기능 실행
		Sonata.speedUp(100);
		Sonata.speedDown(40);
		Sonata.show();
		
		// 객체 생성
		Car bmw = new Car();
		bmw.name = "bmw 520";
		bmw.color = "남색";
		bmw.speed = 0;
		
		bmw.speedUp(80);
		bmw.speedDown(40);
		bmw.show();
	
		// Account 객체 생성
		Account kb = new Account();
		
		// 초기화
		kb.bank =  "국민은행";
		kb.id =  "101-11-1001";
		kb.name =  "김유신";
		kb.balance = 0;
		
		// 기능
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
		
		// Account 객체 생성, 초기화, 기능
		Account wr = new Account();
		wr.bank =  "우리은행";
		wr.id =  "101-12-1001";
		wr.name =  "김춘추";
		wr.balance = 10000;
		
		wr.deposit(50000);
		wr.withdraw(30000);
		wr.show();
		
	}
	

}
