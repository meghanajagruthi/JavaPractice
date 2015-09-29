

class Test{
	
	public Test(){
		System.out.println("base class");
	}
	public void test(){
		System.out.println(int.class);
		System.out.println("This is first method");
	}
}

public class ConstructorPractice extends Test{

	public ConstructorPractice(){
		System.out.println("derived class");
	}
	int i;
	public void test(){
		
		System.out.println("This is second method"+i);
	}
	public void test2(){
		System.out.println("other method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice t=new ConstructorPractice();
        t.test();
        System.out.println(Integer.class.toString());
        System.out.println(Test.class.toString());
        System.out.println(Test.class.getName());
        System.out.println(Test.class.isInstance(null));
        
	}

}
