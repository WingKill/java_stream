package com.java.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOMain5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();   
		System.out.print("사본 이름: ");
		String dsts = sc.nextLine();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dsts))){
			int data;
			while (true) {
				data = in.read(); // 파일을 1바이트씩 읽어내린다.
				if(data == -1) // -1 : 파일의 마지막 부분. 마지막까지 다 읽었는가?
					break;	
				out.write(data); // 파일에 1바이트를 쓴다.
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
	 