package ch05;

public class P146 {
	int stuedentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		P142 studentAhn = new P142();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
