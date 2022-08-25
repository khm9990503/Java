package sub3;

public class Calc {
	
	private static Calc instance = new Calc(); // Calc을 Class Area로 넘기기. 외우기
	
	public static Calc getInstance() { // 외부 호출한 걸 받아오겠다. 외우기
		return instance;
	}
	
	private Calc() {}; // 외부에서 접근 못 하게 막음 Calc cal = new Calc(); 못씀 외우기
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
	
	
}
