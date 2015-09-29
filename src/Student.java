
public class Student { //example for simple implementation of class and object

	int rollNum; //Class variables are stored at heap memory and get memory at runtime
	String name;
	public Student(int number,String name){ // Objects which doesnot have any reference they are called as annonymous objects 
		rollNum=number;
		this.name=name;
		
	}
	public int getRollNum() {
		return rollNum;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(1,"mj"); //Here s1 and s2 are reference variables and are stored in stack where as objects are stored in heap and these objects are referred 
		Student s2=new Student(2,"mj");
		System.out.println("The student details are");
		System.out.println(s1.getName()+"     "+s1.getRollNum());
		System.out.println(s2.getName()+"     "+s2.getRollNum());
		
	}

}
