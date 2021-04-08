package com.revature;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am printing from thread: " + Thread.currentThread().getName());
		}
		
	}
	
}
