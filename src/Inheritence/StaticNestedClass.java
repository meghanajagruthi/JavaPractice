public class StaticNestedClass {

	static int data = 30;

	static class Inner {
		Inner(){ //An object is created only when object is instantiated using new operator
			System.out.println("in constructor");
		}
		static void msg() {
			System.out.println("data is " + data);
		}
		
	}

	public static void main(String args[]) {
	    StaticNestedClass.Inner.msg();
		
	}

}
