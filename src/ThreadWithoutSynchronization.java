//Threads can be synchronized without using synchronized keyword....This can be done using join method to some extent
class Table{
	
	void printTable(int n){ //shared resource if not synchronized leads to inconsistent data output
		for(int i=0;i<5;i++){
			System.out.println(n*i);
			try{
				Thread.sleep(4000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t1){
		this.t=t1;
	}
	public void run(){  
		t.printTable(5);  
		} 
}

class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
public class ThreadWithoutSynchronization {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t1.join();
		t2.start();  
		
	}

}
