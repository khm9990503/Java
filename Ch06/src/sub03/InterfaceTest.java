package sub03;
/*
 * 날짜 : 2022/09/01
 * 이름 : 구홍모
 * 내용 : 인터페이스 실습하기
 * 
 * 인터페이스(Interface)
 * - 클레스간의 공통의 통일된 표준 규격을 통해 클레스 구조를 설계하는 문법
 * - 다른 이름으로는 프로토콜
 * - 인터페이스를 활용해서 객체간 결합도를 완화하는 효과를 얻는다.(다형성)
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		//인터페이스를 활용한 결합도 낮추기
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
	}

}
