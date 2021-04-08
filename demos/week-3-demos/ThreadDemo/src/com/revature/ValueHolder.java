package com.revature;

public class ValueHolder {

	private int i = 0;
	private Object lock = new Object();
	
	public /*synchronized*/ void increaseValue() {
		
		// IN this case, multiple threads can be inside the method at the same time, but not inside this block
		// If a thread is already inside this block, the other threads will enter the BLOCKED thread state
		// and wait until the key is available before another one takes it
		synchronized (lock) {
			i = i + 1;
		}
	}
	
	public int getValue() {
		return this.i;
	}
	
}
