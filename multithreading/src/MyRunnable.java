public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread #2 has started");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread #2: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 has finished");
	}

}
