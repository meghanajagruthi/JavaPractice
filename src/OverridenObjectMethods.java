
public class OverridenObjectMethods {

	public void test(){
		System.out.println("This is a test program");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OverridenObjectMethods t=new OverridenObjectMethods();
      try{
    	  return;
    	//System.exit(0);  
      }
      finally{
    	  System.out.println(t.hashCode());
          System.out.println(t);
      }
      
	}

}
