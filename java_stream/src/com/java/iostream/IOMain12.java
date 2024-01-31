package com.java.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class IOMain12 {
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
			int count = 0;
			while(true) {
				str = b_r.readLine();
				count++;
				if(str == null)
					break;
				System.out.print(count + " : " + str + "\n");
			}					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}