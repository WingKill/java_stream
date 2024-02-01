package com.java.thread;

public class ThreadMain {

	public static void main(String[] args) {
		/*
		 * // 음악 프로그램 
		 * for(int i = 0 ; i < 300 ; i++) { System.out.print("-"); }
		 * 
		 * // 동영상 프로그램
		 *  for(int i = 0 ; i < 300 ; i++) { System.out.print("|"); }
		 *  
		 *  // 해당 코딩은, 프로그램 하나가 실행되고 나서 이후 프로그램이 실행되는 구조를 보여주는 예시.
		 *    
		 */
		
		MusicThread musicThread = new MusicThread();
		
		Runnable r = new PlayerThread();
		Thread playerThread = new Thread(r);
		
		musicThread.start();
		playerThread.start();
		
		// 쓰레드의 실행 원리를 보여주는 코딩. 실행 결과를 예측할 수가 없다.
		// 동시에 실행한다.
		
		// 해당 프로그램은, Thread가 3개가 돌아가는 것이다. mainThread + musicThread + playerThread
	}
}

class MusicThread extends Thread{
	@Override
	public void run() {
		// 음악 프로그램
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("-");
		}
	}
}

class PlayerThread extends Thread{
	@Override
	public void run() {
		// 동영상 프로그램
		for(int i = 0 ; i < 300 ; i++) {
			System.out.print("|");
		} 
	}

}