package prac.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP/IP 기반의 에코 서버
 * 
 * @Author 김재훈
 * @Date 2023. 2. 6.
 */
public class EchoServer {
	private static final int PORT = 2023;

	private static ServerSocket serverSocket;

	// 서버 구동
	public static void startServer() throws IOException { // 여기서 트라이캐치 하는거보다 이걸 실행할 메인으로 던지는게 좋다.
		System.out.println("[서버(" + PORT + ")] 구동되었습니다.");
		serverSocket = new ServerSocket(PORT);
		System.out.println("[서버(" + PORT + ")]가 클라이언트 연결 요청을 수신 대기합니다.");
	}

	// 클라이언트 연결 수신 및 데이터 에코 기능
	public static void echo() throws IOException {
		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("[클라이언트(" + socket.getInetAddress().getHostAddress() + ")] 연결해옴.");

			// #3. 생성된 소켓을 이용해서 데이터 송수신
			// 서버쪽 소켓까지 지금 데이터가 들어왔다.
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			while (true) {
				String clientMessage = in.readUTF();
				System.out.println("[클라이언트]로부터 수신한 메시지: " + clientMessage);
				if (clientMessage.equalsIgnoreCase("q")) {
					break; // while문 빠져나감.
				}
				out.writeUTF(clientMessage);
			}
			// #4. 연결 끊기(소켓 닫기)
			socket.close();
			System.out.println("[클라이언트(" + socket.getInetAddress().getHostAddress() + ")]와 연결을 종료합니다.");
		}
	}

	// 서버 종료
	public static void stopServer() throws IOException {
		serverSocket.close();
	}

	public static void main(String[] args) {

		// EchoServer를 사용자 스레드로 실행
		Thread thread = new Thread() {
			@Override
			public void run() {
				EchoServer echoServer = new EchoServer();
				try {
					echoServer.startServer();
					echoServer.echo();
				} catch (IOException e) {
					System.err.println("서버 실행 중 아래와 같은 오류가 발생하였습니다.");
					System.out.println(e.getMessage());
				}
			}
		};
		thread.start();

		// GUI 프로그램 대신 Scanner 활용 서버 종료 처리
		Scanner scanner = new Scanner(System.in);
		System.out.print("서버를 종료하려면 q 명령어를 입력하세요");
		while (true) {
			String command = scanner.nextLine();
			if (command.equalsIgnoreCase("q")) {
				try {
					stopServer();
					break;
				} catch (IOException e) {}
				
			}

			
		}

	}

}
