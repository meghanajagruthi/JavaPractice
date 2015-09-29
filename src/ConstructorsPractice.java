
public class ConstructorsPractice extends baseClass{

	public void test(double i){
		System.out.println("Double function");
	}
	public void test(int i){
		 System.out.println("In the test function of baseClass"+i);
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ConstructorsPractice cp=new ConstructorsPractice();
		cp.test(2);
		cp.test();
		
	}

}

 class baseClass{
	
	 public void test(){
		 System.out.println("In the test function of baseClass");
	 }
}