public class DaemonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work");
		} else {
			System.out.println("user thread work");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d = new DaemonThread();
		d.setDaemon(true); //Once a thread is started we cannot set it to daemon thread
		d.start();
	}

}
