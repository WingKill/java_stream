package com.java.network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class NetworkMain2 {
	public static void main(String[] args) {
		// 웹 브라우저의 프로그램 원리
		String code = null;
		System.out.println("웹 주소를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String address = sc.next(); // 검색할 웹주소.
		sc.close();
		
		try {
			URL url = new URL(address); 
			URLConnection con = url.openConnection(); 
			// 네트워크에 스트림을 사용하여 연결된 상태가 된다.
			
			BufferedReader webData = 
					new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			FileWriter fw = new FileWriter("C:\\Users\\601-16\\OneDrive\\바탕 화면\\test.html",false);
			
			while((code = webData.readLine())!= null) {
				fw.write(code);
			}
			
			System.out.println("The End");
			
			fw.close();
			webData.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

