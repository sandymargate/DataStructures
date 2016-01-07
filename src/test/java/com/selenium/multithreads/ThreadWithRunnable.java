package com.selenium.multithreads;

public class ThreadWithRunnable implements Runnable {

	public void run() {
		System.out.println("The thread is running......");

		printTable(Thread.currentThread());
		System.out
				.println("=============================================================");

	}

	public static void main(String[] s) {
		ThreadWithRunnable run = new ThreadWithRunnable();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		
		t1.setPriority(2);
		t2.setPriority(1);
		t3.setPriority(10);
		t4.setPriority(7);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

	public void printTable(Thread th) {
		
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Priority Name: " + th.getPriority());
		System.out.println("Thread State: " + th.getState());
		System.out.println("Thread Alive: " + th.isAlive());
		System.out.println("Thread Deamon: " + th.isDaemon());
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
