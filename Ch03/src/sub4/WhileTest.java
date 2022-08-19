package sub4;
/*
 * 날짜 : 2022/08/18
 * 이름 : 구홍모
 * 내용 : Java 반복문 while 실습
 * 
 * 
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;//초기
		
		while(k <= 10) {//조건
			
			sum+=k;
			k++;//증감
			
		}
		
		System.out.println("1부터 10까지 합 : "+sum);
		// do ~while문
		int tot = 0;
		int i = 1;
		
        do{ if(i%2 == 0) {
        	 
        	tot += i;
        }
			
        
        i++;
			
			
		}
		while(i<=10);
			
			System.out.println("1부터 10까지 짝수합 : "+tot);
			
		// break
			
		int num = 1;
			
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) {
				
				break; // 반복문 탈출
			}
			num++;
		}
			System.out.println("5와7의 최소공배수 : " + num);
			
			
		// continue
		int total = 0;
		int j = 1;
		
			
			
		while(j <= 10) {
			
			j++;
			
			if(j%2==1) {
				continue; // 다시 반복문 처음으로 올리기
			}
			total += j;
		}
		System.out.println("1부터 10까지 짝수합 : "+total);
	}

}
