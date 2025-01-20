/*
	thread: A part of a program called a thread, which is a light weight process within a process.
	
	daemon thread: A low priority thread that runs in the background to perform task such as garbage
	 			   collection. The Java Virtual Machine (JVM) terminates itself when all user threads
	 			   (non-daemon threads) finish.
	
	multithreading: A feature that allows concurrent execution of two or more parts of a program
					in threads for maximum utilisation of a CPU. Each thread has a priority with
					higher priority threads executed in preference. The Java Virtual Machine (JVM)
					continues to execute threads until either of the following:
					    1. The exit method of class Runtime has been called.
					    2. All user threads have died.
*/

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// There are two methods used to create a thread
		
		// Method 1: Create thread instance using thread class
		MyThread thread1 = new MyThread();
		thread1.start();
		
		// Method 2: Create a thread instance by passing a runnable object to the thread class
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
		thread1.join(); // Wait for thread1 to finish
		thread2.setDaemon(true); // Set thread to be a daemon thread so JVM will not wait
								 // for it to finish before terminating
		thread2.start();
	}

}
