package com.java.iostream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class IOMain7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일: ");
		String src = sc.nextLine();
		
		try(Reader in = new FileReader(src)){
			int ch;
			while(true) {
				ch = in.read(); // 문자를 하나씩 읽음
				if(ch == -1) // 더 읽을 문자가 없다. 다 읽어내고 나면 ch값이 -1이 된다는 것.
					break;
				System.out.print((char)ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
	