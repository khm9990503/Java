package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/15
 * 이름 : 구홍모
 * 내용 : 트랜잭션 실습하기
 * 
 * 트렌잭션
 *  - 트렌잭션은 DB차리의 최소 작업단위로 하나의 작업은 소작업들로 구성
 *  - 트렌잭션 작업은 모두 성공하거나 모두 실패해야만 하는 특성을 가짐
 *  - commit은 모든 작업 확정처리
 *  - Rollback은 작업 전으로 돌아기기 위해 실패 처리
 * 
 */
public class TransactionTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/java1_bank";
		String user = "root";
		String pass = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("오류를 발생할까요?");
		int value = sc.nextInt();
		
		try {
		//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2단계
			Connection conn = DriverManager.getConnection(host,user,pass);
			conn.setAutoCommit(false); // 기본값은 true , transaction 시작
			
		//3단계
			String sql1 = "UPDATE `bank_account` SET `a_balance` = `a_balance` - 10000 WHERE `a_no`=?;";
			String sql2 = "UPDATE `bank_account` SET `a_balance` = `a_balance` + 10000 WHERE `a_no`=?;";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-22-1006");
			
			
		//4단계
			psmt1.executeUpdate();
			
			if(value == 1) {
				throw new Exception("의도치 않은 에러발생!!!");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); // transaction 끝, 시작과 끝 사이에 오류 발생 시 전부 스탑. Rollback 역할
			
		//5단계
		//6단계
			psmt1.close();
			psmt2.close();
			conn.close();
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("트렌젝션 완료...");
	}

}
