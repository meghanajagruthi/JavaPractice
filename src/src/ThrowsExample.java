import java.io.IOException;


public class ThrowsExample {

	 void m()throws IOException{   //To signal the compiler that this function may about to throw a checked exception throws keyword is used..... If not used properly compile time error is generated
		    throw new IOException("device error");//checked exception  
		  }  
		  void n()throws IOException{  
		    m();  
		  }  
		  void p() throws IOException{  
		 /*  try{  */
		    n();  
		   /*}catch(Exception e){System.out.println("exception handled");}  */
		  }  
		  public static void main(String args[]) throws IOException{  
			  ThrowsExample obj=new ThrowsExample();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
}
