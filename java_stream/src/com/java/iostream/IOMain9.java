package com.java.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOMain9 {
	public static void main(String[] args){
		String ks = "공부에 있어서 돈이 필수는 아니다.";
		String es = "Life is long if you know how to use it.";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));){
			bw.write(ks, 0, ks.length());
			bw.newLine(); 
			// 줄 바꿈 문자 삽입.(운영체제 별로 줄 바꿈 표시 방식이 다르기 때문)
			bw.write(es, 0, es.length());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader bw = new BufferedReader(new FileReader("data.txt"));){
			String str;
			while(true) {
				str = bw.readLine(); // 한 문장 읽어들이기
				if(str == null)
					break;
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
}
	