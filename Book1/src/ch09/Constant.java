package ch09;

public class Constant {
	int num = 30;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num=50;
		//cons.NUM=200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
