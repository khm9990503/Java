package ch08;

public class VIPcustomer extends Customer {
	private int agentId;
	double saleRatio;
	
	public VIPcustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPcustomer() 생성자 호출 ");
	}
	
	public VIPcustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPcustomer() 생성자 호출 ");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint +=  price *  bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public String showCustomerInfo() {
			return super.showCustomerInfo() + "담당 상담원 번호는 "+ agentId + "입니다.";
	}
	
	public int getAgentId() {
		return agentId;
	}

}
