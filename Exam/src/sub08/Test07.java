package sub08;
/*
 * 날짜 : 2022/09/29
 * 이름 : 구홍모
 * 내용 : 자바 총정리 연습문제 
 * 
 */

import java.util.ArrayList;
import java.util.List;

class Products {
	List<Product> list = new ArrayList<>();
	
	public void SetProduct(String item, int price) {
		Product product = new Product();
		product.setItem(this, item, price); // this -> Products
	}
	
	public void showlist() {
		for(Product p : list) {
			System.out.printf("상품:%s, 가격:%,d\n", p.getItem(), p.getPrice());
		}
	}
	
	private class Product { // 내부 클래스
		private String item;
		private int price;
		
		public void setItem(Products outer, String item, int price) {
			this.item = item;
			this.price = price;
			
			outer.list.add(this); // this -> Product
		}
		
		public String getItem() {
			return item;
		}
		
		public int getPrice() {
			return price;
		}
	}
}

public class Test07 {
	public static void main(String[] args) {
		Products products = new Products();
		products.SetProduct("신발", 30000);
		products.SetProduct("셔츠", 20000);
		products.SetProduct("바지", 15000);
		
		products.showlist();
	}

}
