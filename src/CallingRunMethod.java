
public class CallingRunMethod extends Thread{

	public void run(){
		System.out.println("Thread in run mode");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingRunMethod crm=new CallingRunMethod(); //Each thread starts in a new call stack
		crm.start();
		crm.run();//When called adds to the current call stack

	}

}
