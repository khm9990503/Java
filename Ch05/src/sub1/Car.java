package sub1;

// 클레스 정의 : 클레스는 그룹이다. 6개의 맴버로 이루어진 카 클레스(그룹)
public class Car {
	
	//자동차 속성(변수) 선언만 한다. 초기화 X
	String	name;			// 맴버 변수
	String	color;
	int 	speed;			// 전역 변수 speed
	
	
	//자동차 기능(메서드)
	public void speedUp(int speed) {		// 지역 변수 speed
		this.speed += speed;      			// this를 붙이면 전역변수임을 명시함
		
	}		// 맴버 메서드
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("속도 : "+speed);
	}
	
}
