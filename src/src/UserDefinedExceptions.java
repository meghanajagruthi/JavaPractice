
public class UserDefinedExceptions {

	static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(13);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  

}
class InvalidAgeException extends Exception{  //To make any class as a exception object it must be subclassed to exception class and super(message) is called in that constructor
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  