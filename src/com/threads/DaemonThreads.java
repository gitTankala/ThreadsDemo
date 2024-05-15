package com.threads;

public class DaemonThreads extends Thread {
	
	public void run() {
		System.out.println("Daemon Thread");
	}
	
	public static void main(String args[]) {
		System.out.println("Main Thread");
		DaemonThreads dt = new DaemonThreads();
		dt.setDaemon(true);
		dt.start();
	}
}


// Interesting observation:

// If we provide only the line nos. 11 to 13 and didn't provide line 10.. then we did not get the line 6 printed. Only when we provided line 10, then line 6 also got printed along with line 10.