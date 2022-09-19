package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	//동기방식 메서드로 만들기 : synchronized 선언
	//동기화 블럭 : 스레드간 경합을 막고 동기방식으로 실행 -> 1이 실행중이면 2,3은 잠김.
	public synchronized void setNum() { // 동기방식이 아니면 1,2,3 스레드가 겹쳐서 실행이 씹힌다.
		num++;
	}

}
