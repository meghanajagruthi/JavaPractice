//In Synchronization whenever a thread gets a lock it reads data from main memory to cache and when it releases the lock th save the changes from cache to main memory maintaining mutual exclusivity
public class SleepMultipleThreads extends Thread{
//Instead of synchronized variable we have volatile variables which provides synchronization at variables level. When a volatile variable is encountered the variables value is read from main memory rather than cache
	
	public static void main(String[] args) { //We cannot start a thread twice if we try so IllegalStateException will be reported
		// TODO Auto-generated method stub
		SleepMultipleThreads t1=new SleepMultipleThreads();  
		SleepMultipleThreads t2=new SleepMultipleThreads();  
		  t1.start();  
		  t2.start();  //Static synchronized method  locks on level of class (i.e every object of that class)	whereas synchronized method locks on current object
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
	}

}
