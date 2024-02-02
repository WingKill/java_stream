package com.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class MakeClientMain {
	public static void main(String[] args) {
		new MakeClientSocket();
	}
}

class MakeClientSocket{
	// Server가 아니므로 서버 소켓이 필요하지 않음.
	Socket socket = null;
	
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	public MakeClientSocket() {
		try {
			socket = new Socket("localhost",2000);
			//  server가 아니니 때문에, ip와 포트번호(프로그램 번호)를 같이 받아 연결한다.
			
			writer = new PrintWriter(socket.getOutputStream(),true);
			// true : 내부적으로 안에 있는 버퍼를 자동적으로 깨끗이 지우라는 의미
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// socket에 끌고 와야 한다.
			
			String str = null;
			BufferedReader sReader = 
					new BufferedReader(new InputStreamReader(System.in));
			while ((str = sReader.readLine())!= null) {
				writer.println(str);
				System.out.println("output : " + str);
			}
			writer.close();
			reader.close();
			sReader.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}