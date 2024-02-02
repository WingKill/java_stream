package com.java.thread;

public class ThreadMain6 {

	public static void main(String[] args) {
		Thread width = new ThreadWidth();
		Thread height = new ThreadHeight();
		
		width.start();
		height.start();
	}
}

class ThreadWidth extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 300; i++)
	        System.out.printf("%s", new String("-"));                

	}
}

class ThreadHeight extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 300; i++) 
	        System.out.printf("%s", new String("|"));        
	}
}
// 아래의 가로 찍기와 세로찍기를 쓰레드로 돌리시오.



