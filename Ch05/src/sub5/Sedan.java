package sub5;

public class Sedan extends Car {
	
	private int cc;
	
	public Sedan (String name, String color, int speed, int cc) {
		super(name,color,speed);
		this.cc=cc;
	}
	
	public void speedTurbo() { // 부모님이 외부에서 참조 못하게 막아둠. -> private , 자식이 참조할수 있게 -> protected
		this.speed+=20;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("배기량 : "+cc);
	}

}
