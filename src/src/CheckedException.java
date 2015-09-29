
public class CheckedException {

	void m(){  
	    throw new java.io.IOException("device error");//checked exceptions are not propagated from one method to another...But can be propagated using throws keyword  
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  CheckedException obj=new CheckedException();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  

}
