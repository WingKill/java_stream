package com.java.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOMain14 {
	public static void main(String[] args){
		//data.txt를  console 화면에 뿌리도록 하시오.
		try(BufferedReader buffread = new BufferedReader(new FileReader("data.txt"))){
			String str; 
			while(true) {
				str = buffread.readLine();
				if(str == null)
					break;
				System.out.println(str);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	