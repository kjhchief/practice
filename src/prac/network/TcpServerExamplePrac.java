package prac.network;

import java.net.ServerSocket;

/**
 * TCP/IP 기반의 자바 서버
 * 
 * @Author 김재훈
 * @Date 2023. 2. 6.
 */
public class TcpServerExamplePrac {

	public static void main(String[] args) {
		int port = 2023;
		
		System.out.println("[서버] 구동되었습니다.");
		ServerSocket serverSocket = new ServerSocket(port);

	}

}
