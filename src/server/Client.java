package server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			InetAddress ip = InetAddress.getLocalHost();
			String serverIp = ip.getHostAddress();
			// 서버연결
			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			// 파일 수신용 클래스 생성 및 시작
			Receiver receiver = new Receiver(socket);
			receiver.start();
			new Player();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
