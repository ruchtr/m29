package org.tnsif.multithreading;

public class ThreadProgram extends Thread {

	public void run()
	{
		System.out.println("Thread is in the running state");
	}

	
	public static void main(String[] args) {
		//threadprogram.run();
		
		ThreadProgram t = new ThreadProgram();
		t.start();
	}

}
