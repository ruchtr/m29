//program to demonstrate on multithreading
package org.tnsif.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//Retruns a reference to the currently executing thread object.
		Thread t = Thread.currentThread();
		System.out.println("Current Thread is: "+t);
	}

}
