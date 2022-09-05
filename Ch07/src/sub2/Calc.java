package sub2;


public class Calc {

	
	private static Calc instance = new Calc(); // Calc을 Class Area로 넘기기. 외우기
	
	public static Calc getInstance() { // 외부 호출한 걸 받아오겠다. 외우기
		return instance;
	}
	
	private Calc() {};
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) throws Exception {
		if(y<=0) {
			// 예외 강제 발생
			Exception e = new Exception("y는 0보다 작으면 안됩니다."); // 0보다 작거나 같은 y 값을 안 받으려고
			throw e;
		}
		
		int z = x*y;
		
		return x*y;
	}
	public int div(int x, int y) throws ArithmeticException {	// y값이 0 일 때 에러 // 예외처리를 떠넘기기
		
		int z =x/y;
		
		return z;
	}
	
	
	
}
