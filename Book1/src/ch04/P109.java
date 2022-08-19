package ch04;

public class P109 {
	public static void main(String[] args) {
		int num = 1; // 초기
		int sum = 0;
		
		while(num<=10) { //조건
			sum += num;
			num++; // 증감
			
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
