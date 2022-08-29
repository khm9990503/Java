package sub5;

// 클레스 정의 : 클레스는 그룹이다. 6개의 맴버로 이루어진 카 클레스(그룹)
public class Car {
	
	//자동차 속성(변수) 선언만 한다. 초기화 X
	protected String	name;			// 맴버 변수
	protected String	color;
	protected int 	speed;			// 전역 변수 speed
	
	//생성자
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// getter, setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
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
