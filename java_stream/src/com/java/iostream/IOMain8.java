package com.java.iostream;

import java.io.FileWriter;
import java.io.Writer;

public class IOMain8 {
	public static void main(String[] args){
		try(Writer out = new FileWriter("data.txt")) {
			for(int h = (int)'a'; h < (int)'z'+1; h++) {
				out.write(h);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	