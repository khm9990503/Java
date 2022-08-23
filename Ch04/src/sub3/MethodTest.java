package sub3;
/*
 * 날짜 : 2022/08/23
 * 이름 : 구홍모
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 *  - 자주 사용하는 코드로직을 모듈화한 구조제
 *  - 메서드에 선언한 변수는 지역변수이고 해당 메서드가 끝나면 메모리에서 소멸
 */
public class MethodTest {
	
	int num = 1; // 전역변수(지역<->전역)
	
	public static void main(String[] args) {
		
		int r1 = f(1); // 1.선언 2.메서드 호출 3.변수에 대입
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		//method 지역변수와 스택
		// - 식 안의 값은 인자값
		
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
		
	} // main end
	
	// f method 정의 
	//  - void : 반환타입 없다. (출구 없다.) 클레스 이름은 대문자 시작, 메서드 이름은 소문자 시작
	//  - 식 안의 값은 매개변수 Parameter
	public static int f(int x) {
		
		int y = 2*x+3;
		
		return y;
		
	
		
	}// f method end , void와return은 동시에 사용 못 한다.
	
	//total, start, end, k는 지역변수 
	//push -> stack -> pop(for문에서 나오면 k는 pop, sum메서드에서 나오면 start,end,total은 pop)
		public static int sum(int start, int end) {
			
			int total = 0;
			
			for(int k=start;k<=end;k++) {
				total+=k;
			}
			
			return total;
			
		}

}
