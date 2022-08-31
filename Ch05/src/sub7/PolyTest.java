package sub7;
/*
 * 날짜 : 2022/08/31
 * 이름 : 구홍모
 * 내용 : Java 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 * - 상속 관계에서 부모 클레스의 기능이 자식 클레스에서 여러 기능으로 변하는 특성
 * - 객체 타입 선언을 부모 클레스 타입으로 선언하는 것
 * - 다형성을 이용해서 프로그래밍의 중복을 줄이고 유연성을 높인다. 
 * - 객체 간의 응집도는 높이고 결합도는 낮추어야 좋다.
 * - 객체 간의 결합도를 낮추어 에러 발생 시 문제가 덜 하다.
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		//다형성을 적용한 객체생성
		
		Animal a1 = new Tiger(); // 부모에게 상속받는 걸 알 수 있으면서 유연성을 높인다. Upcasting
		Animal a2 = new Eagle();	// 참조변수의 타입 선언을 부모 타입으로 선언하는 것.
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		//객체 타입 다운캐스팅 (자식을 부모로 선언 Upcasting, 부모를 자식으로 선언 Downcasting)
		
		Tiger tiger=(Tiger) a1;
		Eagle eagle=(Eagle) a2;
		Shark shark=(Shark) a3;
		
		tiger.move();
		eagle.move();
		shark.move();
		
		//객체 타입 연산
		if(a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}
		if(a2 instanceof Eagle) {
			System.out.println("a2는 Eagle입니다.");
		}
		if(a3 instanceof Shark) {
			System.out.println("a3는 Shark입니다.");
		}
	}

}
