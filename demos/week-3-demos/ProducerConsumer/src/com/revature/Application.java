package com.revature;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {

	public static final int NUM_OF_PRODUCERS = 100;
	public static final int NUM_OF_CONSUMERS = 100;
	
	public static final int BUFFER_SIZE = 100;
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());

		Queue<Integer> buffer = new ArrayBlockingQueue<>(BUFFER_SIZE);
		
		Set<Producer> producers = new HashSet<>();
		
		for (int i = 0; i < BUFFER_SIZE / 2; i++) {
			buffer.add(-(i + 1));
		}
		
		for (int i = 0; i < NUM_OF_PRODUCERS; i++) {
			Producer p = new Producer();
			p.setBuffer(buffer);
			producers.add(p);
		}
		
		Set<Consumer> consumers = new HashSet<>();
		
		for (int i = 0; i < NUM_OF_CONSUMERS; i++) {
			Consumer c = new Consumer();
			c.setBuffer(buffer);
			consumers.add(c);
		}
		
		for (Producer p : producers) {
			p.start();
		}
		
		for (Consumer c : consumers) {
			c.start();
		}
		
	}

}
