package sub1;

public class FruitBox<T> {		//치환변수 T를 가지는 제네릭 클레스
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
