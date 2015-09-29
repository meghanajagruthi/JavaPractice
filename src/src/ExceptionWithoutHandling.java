
public class ExceptionWithoutHandling {

	public static void main(String[] args) { //If an exception is not handled then JVM provides default exception handler that prints the stack trace,exits the program else the application is continued without any hamper
		// TODO Auto-generated method stub
      
		try{
		int data=50/0;
		System.out.println(data);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("End of the exception");
	}

}
