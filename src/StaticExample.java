public class StaticExample { //static variables get memory when class is loaded and they get memory only once

	int rollnum;
	String name;
	static String college = "meghana";

	StaticExample(int rollNum, String name) {
		this.rollnum = rollNum;
		this.name = name;
	}

	void display() {
		System.out.println(rollnum + " " + name + " " + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticExample s1 = new StaticExample(111,"Karan");  
		StaticExample s2 = new StaticExample(222,"Aryan");  
		   
		 s1.display();  
		 s2.display(); 
	}

}
