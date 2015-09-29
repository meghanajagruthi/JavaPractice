
public class StaticVariable {

	int rollno;  
	   static String name;  
	   static String college ="ITS";  
	     
	   StaticVariable(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticVariable sv=new StaticVariable(1,"mj");
      System.out.println(sv.name);
      StaticVariable sv2=new StaticVariable(2,"mj123");
      System.out.println(sv2.name);
      System.out.println(sv.name);
	}

}
