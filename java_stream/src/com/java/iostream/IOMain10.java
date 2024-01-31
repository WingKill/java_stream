package com.java.iostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOMain10 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		while(true) {
			try{
				System.out.print("이름 전화번호>>");
				String str = sc.nextLine();
				if(str.equals("그만")) {
					sc.close();
					return;
				}
				System.out.println("저장 완료");
				write(str);
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("잘못된 입력입니다.");
				main(null);
			}
			
		}
	}	
	public static void write(String str){
		try(BufferedWriter buffwrite = new BufferedWriter(new FileWriter("phone.txt", true))){
			buffwrite.write(str,0,str.length());
			buffwrite.newLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void read() {
		try(BufferedReader buffRead = new BufferedReader(new FileReader("phone.txt"))){
			String str1; 
			while(true){
				str1 = buffRead.readLine();
				if(str1 == null)
					break;
				System.out.println(str1);
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
// 1. Scanner로 입력받은 이름과 전화번호를 한 줄에 한 사람씩 phone.txt파일에 저장하라. “그만”을 입력하면 프로그램을 종료한다	