//Example for deadlock
public class SynchronizedBlock { //It is possible to run thread on non static synchronization method and other thread in static synchronization simultaneously

	public static void main(String[] args) { // synchronized keyword synchronizes thread memory with main memory
		// TODO Auto-generated method stub
		 final String resource1 = "ratan jaiswal";  
		    final String resource2 = "vimal jaiswal";  
		    // t1 tries to lock resource1 then resource2    
		    
		    //Deadlock can be removed if the nested synchronized blocks are defined in the same order ... so when thread1 access  synchronized (resource1) second thread has to wait till the first thread releases 
		    Thread t1 = new Thread() {  
		      public void run() {  
		          synchronized (resource1) {  
		           System.out.println("Thread 1: locked resource 1");  
		  
		           try { Thread.sleep(100);} catch (Exception e) {}  
		  
		           synchronized (resource2) {  
		            System.out.println("Thread 1: locked resource 2");  
		           }  
		         }  
		      }  
		    };  
		  
		    // t2 tries to lock resource2 then resource1  
		    Thread t2 = new Thread() {  
		      public void run() {  
		        synchronized (resource2) {  
		          System.out.println("Thread 2: locked resource 2");  
		  
		          try { Thread.sleep(100);} catch (Exception e) {}  
		  
		          synchronized (resource1) {  
		            System.out.println("Thread 2: locked resource 1");  
		          }  
		        }  
		      }  
		    };  
		  
		      
		    t1.start(); 
		/*    t1.join(); to remove deadlocks*/
		    t2.start();  
		  }  

}
