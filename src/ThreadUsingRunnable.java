
public class ThreadUsingRunnable  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadUsingRunnable thread=new ThreadUsingRunnable();
		new Thread(thread).start();  //When the thread constructor is invoked the class here "ThreadUsingRunnable" become thread object
	} //Runnable is more flexible as it separates code to be executed from code which helps to the execute and also multiple classes and interfaces can be implemented along with  runnable interface

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread has been created");
		
	}

}
