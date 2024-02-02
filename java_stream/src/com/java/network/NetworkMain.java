package com.java.network;

import java.net.InetAddress;
import java.util.Scanner;

public class NetworkMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Host의 이름을 입력하세요. ");
		try {
			InetAddress inetAddress = InetAddress.getByName(sc.next());
			sc.close();
			System.out.println(inetAddress.getHostName());
			System.out.println(inetAddress.getHostAddress());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
