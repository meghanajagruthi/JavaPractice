class Tabl12{
	
	synchronized void printTable(int n){ //shared resource if not synchronized leads to inconsistent data output
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

class MyThread01 extends Thread{
	Tabl12 t;
	MyThread01(Tabl12 t1){
		this.t=t1;
	}
	public void run(){  
		t.printTable(5);  
		} 
}

class MyThread02 extends Thread{  
Tabl12 t;  
MyThread02(Tabl12 t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
public class UsingSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabl12 obj = new Tabl12();//only one object  
		MyThread01 t1=new MyThread01(obj);  
		MyThread02 t2=new MyThread02(obj);  
		t1.start();  
		t2.start();  
	}

}
