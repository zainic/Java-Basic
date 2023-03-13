
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a subclass of Thread
		MyThread thread1 = new MyThread();
		
		// implements Runnable interface and pass instance as an argument to Thread
		MyRunnable runnable1 = new MyRunnable(); // more used
		Thread thread2 = new Thread(runnable1);
		
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		thread1.start();
		//thread1.join(4000); // calling thread (ax.main) wait until the specified thread dies or for x miliseconds
		thread2.start();
		
		System.out.println(1/0);
		
	}

}
