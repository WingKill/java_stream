package com.java.thread;

import javax.swing.JOptionPane;

public class ThreadMain2 {
	public static void main(String[] args) {		
//		Runnable run1 = new InputThread();
//		Thread inputThread = new Thread(run1);
//		
//		Runnable run2 = new NumThread();
//		Thread numThread = new Thread(run2);
		

		System.out.println(Thread.currentThread().getName());
		// 쓰레드 이름 확인하는 방법
		
		InputThread inputThread = new InputThread();
		NumThread numThread = new NumThread();

		inputThread.start();
		numThread.start();
	}
}


class InputThread extends Thread{
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력하신 값은 " + input + "입니다");		
		System.out.println(super.getName());
	}
	
}

class NumThread extends Thread{
	@Override
	public void run() {
		System.out.println(super.getName());
		for(int i = 10; i> 0; i--) {
			System.out.println(i);
			try {
				// 1초간 시간을 지연한다. 다른 쓰레드(다른 프로세스)에게 실행하게끔 양보한다.
				Thread.sleep(1000); 				 
			} catch (Exception e) {	}
		}
	}
}