package com.java.thread;

public class ThreadMain3 {
	public static void main(String[] args) {		
		Runnable r = new AccountThread();
		new Thread(r).start();
		new Thread(r).start();
		
	}
}

class Account{
	private int balance = 1000;
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) throws Exception{ // 출금
		if(balance >= money) {
			Thread.sleep(1000); // 1초
			balance = balance - money;
		}
		// 동기화를 진행하지 않았을 때 에러가 발생하는 이유
		// 에러가 발생하는 이유는, 함수가 완벽하게 끝나기도 전에 다른 쓰레드에서 접근하여 자원을 바꾸기 때문.
		// 그러므로, 함수가 끝나기 전까지는 다른 쓰레드에서 접근하지 못하게 막으면 에러가 발생하지 않는다.
		// 이를 동기화라고 한다.
	}
}

class AccountThread implements Runnable{
	Account account = new Account();
	
	@Override
	public void run() {
		while(account.getBalance()>0) {
			// 100, 200, 300 중 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			try {
				account.withdraw(money);				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("balance:" + account.getBalance());
		}
	}
}
