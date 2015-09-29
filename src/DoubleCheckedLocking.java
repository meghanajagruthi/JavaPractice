public class DoubleCheckedLocking implements Runnable{

	private static volatile int val=0;
	private static volatile DoubleCheckedLocking _instance;

	public void run(){
		try {
			System.out.println(getInstance().getClass());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DoubleCheckedLocking getInstance() throws InterruptedException {
		if (_instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (_instance == null)
					_instance = new DoubleCheckedLocking();
				val=1;
				for(int i=0;i<4;i++){
					System.out.println(val);
					val++;
				}
				Thread.sleep(100);
			}
		}
		return _instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCheckedLocking dc1=new DoubleCheckedLocking();
		DoubleCheckedLocking dc2=new DoubleCheckedLocking();
		Thread t1=new Thread(dc1);
		Thread t2=new Thread(dc2);
		t1.start();
		t2.start();
	}

}
