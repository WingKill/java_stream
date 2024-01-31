package com.java.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOMain11 {
	public static void main(String[] args){
		//IOMain10.read();
		try(BufferedWriter b_w = new BufferedWriter(new FileWriter("system.ini"))){
			b_w.write("aaVod");
			b_w.newLine();
			b_w.write("bbVws");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(BufferedReader b_r = new BufferedReader(new FileReader("system.ini"))) {
			String str;
			while(true) {
				str = b_r.readLine();
				if(str == null)
					break;
				for(int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if(ch >= 97 && ch < 123) {
						ch -= 32;
					}
					System.out.print(ch);
				}
				System.out.println();
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}