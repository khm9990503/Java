package sub3;

public class Car {
	
	// 속성
	
	private String name;
	private String color;
	private int speed;
	public static int count; // 따로 관리 , 입력하지 않아도 기본값인 0으로 나온다. Static은 class Area에 생성
							  // class Area 1순위(main, car카운트), stack 2순위, heap 3순위
	
	// 생성자
	public Car(String name, String color, int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
		count++;	// 생성자가 실행될 때마다 +1
	}
	
	// 기능
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);
		System.out.println("차량번호 : "+count);
	}

}
