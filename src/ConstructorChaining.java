
public class ConstructorChaining {

	int id;
	String name;
	String city;
	public ConstructorChaining(int id){
		
		this.id=id;
		
	}
    public ConstructorChaining(int id,String name,String city){
    	this(id);
    	this.name=name;
    	this.city=city;
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(city);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ConstructorChaining(1, "mj", "HYD");
		
	}

}
