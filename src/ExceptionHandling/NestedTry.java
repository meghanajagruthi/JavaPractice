
public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			try{
				  int b=39/0;  
			}
			catch(ArithmeticException ae){
				System.out.println(ae.getMessage());
			}
			try{
				int a[]=new int[5];  
			    a[5]=4;  
			}
			catch(ArrayIndexOutOfBoundsException ab){
				ab.printStackTrace();
				System.out.println(ab.getMessage());
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
