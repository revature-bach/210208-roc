package com.revature;

public class SecondWay implements Runnable {

	@Override
	public void run() {
		System.out.println("I am printing from thread: " + Thread.currentThread().getName());
	}
	
}
