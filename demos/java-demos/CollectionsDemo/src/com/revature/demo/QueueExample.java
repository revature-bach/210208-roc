package com.revature.demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void demo() {
		System.out.println();
		System.out.println("===== QUEUE DEMO =====");
		// Queues are like a line, in which we can insert elements at the back, and remove elements from the front
		// LinkedList, although it also implements List, also implements Queue
		Queue<String> myQueue = new LinkedList<>();
		
		myQueue.add("1st person");
		myQueue.add("2nd person");
		myQueue.add("3rd person");
		
		String element;
		while(!myQueue.isEmpty()) {
			element = myQueue.poll();
			System.out.println(element);
		}
		
		myQueue.add("1st person");
		myQueue.add("2nd person");
		myQueue.add("3rd person");
		// Java seems to have made a design mistake when implementing Queues, because typically the purpose of a queue is only to be able
		// to see the person in the front of the line when it's their turn
		// However, we're actually about to iterate over a Queue without removing anything or changing anything inside the Queue
		for (String i : myQueue) {
			System.out.println(i);
		}
	}
	
}
