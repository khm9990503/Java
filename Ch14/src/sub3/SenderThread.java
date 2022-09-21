package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;

public class SenderThread extends Thread {
	
	private Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	
	@Override
	public void run() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream()); // 서버로 출력
			
			while(true) {
				
				String msg = br.readLine();
				
				if(msg.equals("bye")) {
					break;
				}
				// 상대방에게 메세지 전송 (서버는 클라로, 클라는 서버로)
				writer.println(msg);
				writer.flush();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				socket.close();
			}catch(SocketException e) {
				System.out.println("종료ㅂㅂ");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
