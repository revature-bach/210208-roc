package com.revature;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		// First way is to extends Thread
//		Thread myThread = new MyThread();
//		Thread myThread2 = new MyThread();
//		
//		myThread.start();
//		myThread2.start();
//
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("I am printing from thread: " + Thread.currentThread().getName());
//		}
//		
//		try {
//			myThread.join(); // join will wait on this line until myThread (Thread-0) is terminated (done with whatever it's doing)
//			myThread2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Main thread is done");
		
		// Second way is to implement Runnable and then pass a Runnable object into the new Thread constructor
//		Thread myThread3 = new Thread(new SecondWay());
//		myThread3.start();
		
		// Since Runnable is a functional interface (it has only 1 abstract method), we can utilize lambdas instead
//		Runnable runnable = () -> {
//			System.out.println("I am printing from thread: " + Thread.currentThread().getName());
//		};
//		
//		(new Thread(runnable)).start();
		
		ValueHolder holder = new ValueHolder();
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName());
				holder.increaseValue();
			}
		};
		
		Thread[] threads = new Thread[10000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(r);
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		System.out.println("Value = " + holder.getValue());
		
	}

}
