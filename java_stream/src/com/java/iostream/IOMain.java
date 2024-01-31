package com.java.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOMain {
	public static void main(String[] args){
//		OutputStream out = null;
//
//		try {
//			out = new FileOutputStream("data.dat");
//			out.write(7);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			if( out !=null)
//				try {
//					out.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//		}
		
		try(OutputStream out = new FileOutputStream("data.dat")){
			out.write(7);
		}catch (Exception e) {
			e.printStackTrace();
		}
				
		/* 파일 읽기 */
		InputStream in = null;
		int dat = 0;
		try {
			in = new FileInputStream("data.dat");	
			dat = in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if( in !=null)
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		System.out.println(dat);
	}
}
	