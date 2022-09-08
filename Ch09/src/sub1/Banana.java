package sub1;

public class Banana {		// Object가 암시적으로 상속중이다.
	
	private String country;
	private int price;
	
	public Banana(String country,int price) {
		this.country=country;
		this.price=price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	
	@Override			// 일반적으로 오버라이드해서 사용한다.
		public String toString() {
		
		System.out.println("country : "+country);
		System.out.println("price : "+price);
		System.out.println("객체 해시값 : "+hashCode());
		
			return super.toString();
		}

}
