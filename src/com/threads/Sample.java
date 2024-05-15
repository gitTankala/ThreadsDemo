package com.threads;

public class Sample extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName()); // Thread-0
	}
	
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName());
		Sample sample = new Sample();
		sample.start();
	}

}

class Sample1 extends Thread {
	
}


// Our very own observations:

//    - When we write a class extends Thread and didn't override the run() method it did not throw any error - not compile time, not run time. Example: Sample1 above.

// Another important note is: We cannot reduce the visibility of the inherited method.



