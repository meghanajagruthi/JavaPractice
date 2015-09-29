
public class NoExceptionCode {

	 public static void main(String args[]){  
		  try{  
			
			  System.exit(0);
		   int data=25/5; 
		   String test=null;
		   System.out.println(test.length()); 
		  
		  }  
		  /*catch(NullPointerException e){System.out.println(e);}  */
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  

}
