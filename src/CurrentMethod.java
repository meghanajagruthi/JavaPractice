public class CurrentMethod extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		 System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentMethod cm = new CurrentMethod();
		cm.start();
		CurrentMethod cm1 = new CurrentMethod();
		cm1.start();
		

	}

}
