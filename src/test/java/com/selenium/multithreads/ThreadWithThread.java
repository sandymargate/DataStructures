package com.selenium.multithreads;

public class ThreadWithThread extends Thread {

	public void run() {
		System.out.println("THe thread is running....");

	}

	public static void main(String[] args) {
		ThreadWithThread t1 = new ThreadWithThread();
		t1.start();
		System.out.println("Thread Name: " + t1.getName());
		System.out.println("Priority Name: " + t1.getPriority());
		System.out.println("Thread State: " + t1.getState());
		System.out.println("Thread Alive: " + t1.isAlive());

	}

}
