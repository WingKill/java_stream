package com.java.iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOMain13 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("대상 파일:");
		String writer = sc.next();
		System.out.println("사본 이름:");
		String reader = sc.next();
		sc.close();
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(writer));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(reader))){
			byte[] b = new byte[1024];
			int len ;
			while(true) {
				len = in.read(b);
				if(len == -1)
					break;
				out.write(b, 0, len);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
//1. 아래와 같이 파일 복사되도록 프로그램을 짜시오
//
//대상 파일: a.pptx
//사본 이름: d.pptx