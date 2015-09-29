public class StaticMethod {
                         //this and super keywords are not used in static keywords because those two keywords are associated with runtime of the object or (creation of object)
	int rollno;
	String name;
	static String college = "CERRID";

	static void staticDisplay() {
		college = "Solutions";
         System.out.println(college);
	}

	public StaticMethod(int id, String name) { //The variables in static block are executed even before main method is called
		rollno = id;
		this.name = name;

	}

	public void display() {
		college = "BNGLE";
		System.out.println(rollno + "              " + name + "        "
				+ college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod(1, "meghana");
		sm.display();
		System.out.println(StaticMethod.college);

	}

}
