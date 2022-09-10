package ch08;

public class P253 {
	public static void main(String[] args) {
		Customer vc = new VIPcustomer (10030,"나몰라",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 "
				+ vc.calcPrice(10000)+"원입니다.");
	}

}
