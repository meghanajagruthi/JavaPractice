public class TestInterruptingThread1 extends Thread{  //The only reason to have wait/notify/notifyAll methods on Object is to allow locking on a per-object basis.


public void run(){  
try{  
Thread.sleep(1000);  
System.out.println("task");  
}catch(InterruptedException e){  
throw new RuntimeException("Thread interrupted..."+e);  
}  
  
}  
  
public static void main(String args[]){  
TestInterruptingThread1 t1=new TestInterruptingThread1();  
t1.start();  
try{  
t1.interrupt();  
}catch(Exception e){System.out.println("Exception handled "+e);}  
  
}  
}  