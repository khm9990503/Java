package sub3;

/*
 * 날짜 : 2022/08/17
 * 이름 : 구홍모
 * 내용 : Java 연산자 실습하기
 * 
 * 연산자 (operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로 산술, 복합대입, 비교, 논리연산자를 많이 사용
 * 
 */
public class OperatorTest {
	
	public static void main(String[] args) {
		
		// 산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num2 * num3;
		int r4 = num4 / num2;
		int r5 = num4 % num3; // 나머지를 구함 4/3의 나머지 1, 4/2의 나머지 0
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		System.out.println("r5 : " + r5);
		
		// 증감연산자
		int num = 1;
		
		num++; // 실행 후 +1
		++num; // 실행 전 +1
		System.out.println("num : " + num);
		
		num--;
		--num;
		System.out.println("num : " + num);
		
		// 복합대입연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4; // int 한 번으로 쭉 나열 가능
		
		n1 += 1; // n1의 값에 1을 더하고 그 값을 n1에 대입한다. n1 = n1 + 1 , 복합대입연산자가 더 좋다.
		n2 -= 2;
		n3 *= 3;
		n4 /= 4;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		// 비교연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2; // var1은 var2보다 크다.
		boolean rs2 = var1 < var2; // var1은 var2보다 작다.
		boolean rs3 = var1 >= var2; // var1은 var2보다 크거나 같다.
		boolean rs4 = var1 <= var2; // var1은 var2보다 작거나 같다.
		boolean rs5 = var1 == var2; // var1은 var2보다 서로 같다.
		boolean rs6 = var1 != var2; // var1은 var2보다 서로 디르다.
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + rs5);
		System.out.println("rs6 : " + rs6);
		
		// 논리연산자
		
		int var3 = 3; // 변수 이름과 데이터가 같게 , 변수는 중복 불가, 변수 이름은 숫자로 시작 불가
		int var4 = 4;
		
		boolean res1 = ( var3 > 3 ) && ( var4 > 3 ); // var3은 3보다 크고 그리고 var4는 3보다 크다 F,T 
		boolean res2 = ( var3 > 2 ) && ( var4 > 3 ); // var3은 2보다 크고 그리고 var4는 3보다 크다 T,T
		boolean res3 = ( var3 > 3 ) || ( var4 > 3 ); // var3은 3보다 크고 또는 var4는 3보다 크다
		boolean res4 = ( var3 > 4 ) || ( var4 > 5 ); // var3은 4보다 크고 또는 var4는 3보다 크다
		boolean res5 = !(var3 > var4); // var3은 var4보다 크지 않다. !는 부정
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		
		
	}

}
