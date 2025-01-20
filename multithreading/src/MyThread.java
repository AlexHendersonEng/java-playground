public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread #1 has started");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread #1: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 has finished");
	}
	
}
