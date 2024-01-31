package com.java.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOMain3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("대상 파일: ");
		String src = sc.nextLine();   
		System.out.print("사본 이름: ");
		String dsts = sc.nextLine();
		
		try(InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dsts)){
			byte buf[] = new byte[1024]; // 1KB 
			
			int len;
			while (true) {
				len = in.read(buf); // 배열 buf로 데이터를 읽어들인다.(읽어들일 데이터가 없으면 -1을 반환)
				if(len == -1) // -1 : 파일의 마지막 부분. 마지막까지 다 읽었는가?
					break;	
				out.write(buf,0,len); //len 바이트만큼 데이터를 저장한다.
//				public int read(byte[] b) throws IOException
//				  → 파일에 저장된 데이터를 b로 전달된 배열에 저장
//				public void write(byte[] b, int off, int len) throws IOException
//				  → b로 전달된 배열의 데이터를 인덱스 off에서부터 len 바이트만큼 파일에 저장
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
	