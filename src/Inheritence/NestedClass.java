
public class NestedClass implements M{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NestedClass.test.run();
      
	}

}

interface M{
	class test{ //This class is treated as a static nested class by the compiler
		static void run(){
			System.out.println("inside test");
		}
	}
}