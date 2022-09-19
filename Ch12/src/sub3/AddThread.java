package sub3;

public class AddThread extends Add implements Runnable {// thread를 다중상속이 불가능하기에 인스턴스를 받아온다.

	private int start;
	private int end;
	
	public AddThread(int start, int end) {
		this.start	= start;
		this.end	= end;
	}
	
	@Override
	public void run() {
		
		for(int k=start;k<=end;k++) {
			setNum(k);
		}
		
	} 

}
