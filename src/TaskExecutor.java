import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new Task("" + i);
			executor.execute(worker);// calling execute method of
										// ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			System.out.println("Finished all threads");
		}
	}

}

class Task implements Runnable {

	private String message;

	Task(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()
				+ " (Start) message = " + message);
		process();
		System.out.println(Thread.currentThread().getName() + " (End)");
	}

	public void process() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}