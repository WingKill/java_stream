package com.java.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerMain {
	public static void main(String[] args) {
		new MakeServerSocket();
	}
}

class MakeServerSocket{
	ServerSocket serverSocket = null;
	Socket socket = null;
	
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	String lineStr = null; 
	//  한 줄씩 읽어들일 문자열을 받는 변수
	
	public MakeServerSocket() {
		try {
			serverSocket = new ServerSocket(2000);
			// socket을 가지고 있다.
			
			while (true) {
				socket = serverSocket.accept(); 
				// 클라이언트가 치고 들어올 때까지 멈춘다.
				// 클라이언트를 기다리는 것이다.
				System.out.println("클라이언트 요청");
				
				writer = new PrintWriter(socket.getOutputStream(), true);
				// true : 자동적으로 버퍼를 지우는 것
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				
				writer.close();
				reader.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}