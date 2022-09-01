package ch06;


public class P175 {
	public String studentName;
	public int grade;
	public int money;
	
	public P175(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus() {
		
		this.money-=1000;
	}
	
	public void takeSubway() {
		
		this.money-=1500;
		
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}

}
