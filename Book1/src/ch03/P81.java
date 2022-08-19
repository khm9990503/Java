package ch03;

public class P81 {
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge>motherAge) ? 'T' : 'F'; // 조건연산자 : 조건식 ? 결과1(참) : 결과2(거짓) 
		
		System.out.println(ch);
	}

}
