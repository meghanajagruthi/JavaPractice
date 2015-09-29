
public class JavaPassByReference {

	public static void main(Cells a,Cells b){
		
		a.setNumber(25);
		b.setNumber(5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cells a=new Cells();
		Cells b=new Cells();
		System.out.println(a.getNumber()+", "+b.getNumber());
		main(a,b);
		System.out.println(a.getNumber()+", "+b.getNumber()); //prints 25,5
	}

}

class Cells {
	public int number;
	public boolean visited = false;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
