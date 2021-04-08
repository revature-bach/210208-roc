package com.revature;

import java.util.Queue;

public class Producer extends Thread {

	private Queue<Integer> buffer;

	public void setBuffer(Queue<Integer> buffer) {
		this.buffer = buffer;
	}

	public static int value = 0;

	@Override
	public void run() {
		try {
		while (true) {
			synchronized (buffer) {
					// if unable to add any value, fall asleep
					while(!buffer.offer(value)) {
						System.out.println("Producer " + super.getName() + " going to sleep, because buffer is full");
						buffer.wait();
					}
					
					System.out.println("Added value: " + value);
					value++;
					
					buffer.notifyAll(); // If the consumer threads are asleep because the buffer was empty,
					// since the producer will have added a value here, notifyAll allows consumers to wake 
					// back up to consume those added values
					
					Thread.sleep(10); // Slow down the producer a bit so that it isn't so fast at producing
					// values
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
