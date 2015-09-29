public class CreationOfThread extends Thread {

	public void run() {
		System.out.println("Creation of thread ");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreationOfThread c = new CreationOfThread();
		c.start();
		c.sleep(4000);
		
	}

}
