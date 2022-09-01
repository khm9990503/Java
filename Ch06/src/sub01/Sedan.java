package sub01;

public class Sedan extends Car{ // 미완성된 기능을 자식이 완성 시켜줌
	
	private int cc;
	
	public Sedan(String name,String color,int speed,int cc) {
		super(name,color,speed);
		this.cc=cc;
		
	}

	@Override
	public void speedUp(int speed) {
		this.speed+=speed+20;
		
	}

	@Override
	public void speedDown(int speed) {
		this.speed-=speed-20;

		
	}

}
