package com.selenium.multithreads;

public class ThreadGroupWithTHread implements Runnable {
	
	public void run(){
		System.out.println("Thread Name is:"+ Thread.currentThread().getName());
	}
	
	public static void main(String [] args)
	{
		ThreadGroup td = new ThreadGroup("Parent Group");
		ThreadGroupWithTHread t1 = new ThreadGroupWithTHread();
		Thread th1 = new Thread(td, t1,"one");
		Thread th2 = new Thread(td, t1,"two");
		Thread th3 = new Thread(td, t1,"three");
		Thread th4 = new Thread(td, t1,"four");
        
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		System.out.println("The thread group is:" + td.getName());	
		td.list();

	}

}
