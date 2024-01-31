package com.java.iostream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOMain4 {
	public static void main(String[] args){
		try(DataOutputStream out = 
				new DataOutputStream(new FileOutputStream("data.dat"))) {
			out.writeInt(370);
			out.writeDouble(3.14);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(DataInputStream in = 
				new DataInputStream(new FileInputStream("data.dat"))) {
			int num1 = in.readInt();
			double num2 = in.readDouble();
			System.out.println(num1);
			System.out.println(num2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	