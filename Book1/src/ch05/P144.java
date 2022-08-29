package ch05;

public class P144 {
	int stuedentID;
	String studentName;
	int grade;
	String address;

	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		P142 studentAhn = new P142();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
