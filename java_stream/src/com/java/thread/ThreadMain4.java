package com.java.thread;

public class ThreadMain4 {
	public static void main(String[] args) {		
		// 쓰레드 동기화 미 진행시 어떻게 쓰레드가 작동하게 되는가를 보기 위한 코드
		// 동기화 전 후 결과를 비교하여 확인하는 코드
		StringPrint sp = new StringPrint();
		
		Thread th1 = new PrintThread(sp,"1번");
		Thread th2 = new PrintThread(sp,"2번");
		Thread th3 = new PrintThread(sp,"3번");
		Thread th4 = new PrintThread(sp,"4번");
		Thread th5 = new PrintThread(sp,"5번");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
	}
}

class PrintThread extends Thread{
	private StringPrint sp;
	private String str;
	
	public PrintThread(StringPrint sp, String str) {
		this.sp = sp;
		this.str = str;
	}
	
	@Override
	public void run() {
		sp.display(str);
	}
}

class StringPrint{
	synchronized void display(String s) {
		for(int i = 1; i<=2;i++) {
			System.out.print(Thread.currentThread().getName() + ".");
			System.out.print(s);
			System.out.println();
		}
		System.out.println();
	}
}