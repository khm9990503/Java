package sub6;

/*
 * 날짜 : 2022/08/31
 * 이름 : 구홍모
 * 내용 : Java override 실습하기
 * 
 * 오버라이드(Override)
 * - 부모클레스의 메서드를 자식 클레스에 맞게 재정의 하는것
 * - 오버라이드를 통해 객체지향프로그래밍의 다형성 실현 // 다형성 = 재정의
 * - 다형성을 활용해서 코드의 반복을 줄이고 유연성을 높인다.
 */
class AAA {
	
	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}
	public void method3() {
		System.out.println("AAA::method3...");
	}
	
}

class BBB extends AAA {
	@Override
	public void method2() {				// final에 오버라이드 당하지 못 함. class에 붙일 경우 마지막 자손이 된다.
		System.out.println("BBB::method2...");
	}
	public void method3(int a) {				//오버로딩
		System.out.println("BBB::method3...");
	}
}
	
	
	


class CCC extends BBB {
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	public void method3(int a, int b) {			// 오버로딩
		System.out.println("CCC::method3...");
	}
}
	

	


public class OverrideTest {
	public static void main(String[] args) {
		//오버라이드 매서드 호출
		CCC c = new CCC();
		
		c.method1();		// 부모 A의 method1을 override 함 덮어씌우기
		c.method2();		// 부모 A의 method2를 B가, 그리고 C가 덮어씌우기
		c.method3();
		c.method3(1);		// method3은 오버로딩
		c.method3(1,2);
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		Truck bongo = new Truck ("봉고","파란색",0,0);
		
		sonata.speedUp(100);
		sonata.speedTurbo();
		sonata.show();
		
		bongo.speedUp(100);
		bongo.show();
		
	}

}
