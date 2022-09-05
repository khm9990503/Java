package ch08;

public class P242 {
	public static void main(String[] args) {
		VIPcustomer customerKim = new VIPcustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint =1000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
