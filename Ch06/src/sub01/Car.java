package sub01;

public abstract class Car {
	
	protected String name;
	protected String color;
	protected int speed;
	
	public Car(String name,String color,int speed) {
		this.name=name;
		this.color=color;
		this.speed=speed;
	}
	
	//기능
	public abstract void speedUp(int speed);		//매서드 선언만 한다. 추상 매서드. {} 없음. 객체 생성 불가
	public abstract void speedDown(int speed);
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("차량속도 : "+speed);
	}

}
