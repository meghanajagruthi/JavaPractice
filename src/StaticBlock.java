
public class StaticBlock { //Not possible in the JDK above 1.7
	//All the static variables are loaded in the class area
	static{
		System.out.println("Inside the static block");
		System.exit(0);
	}

}
