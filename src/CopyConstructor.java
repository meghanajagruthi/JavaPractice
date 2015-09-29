
public class CopyConstructor { //When u assign two references  then both the both the references point to same object and whenever any changes are made it is directly reflected on another reference

	int id;
	String name;
	public CopyConstructor(){ //Constructor returns current reference of the class can be used to start a thread ,create an object, or any piece of code that is performed by any other method can be done using constructors
		
	}
	
	public CopyConstructor(int id,String name){
	 
		this.id=id;
		this.name=name;
		
	}
	public void display(){
		System.out.println(id+"   "+name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CopyConstructor c1=new CopyConstructor(1,"mj");
		CopyConstructor c2=new CopyConstructor();
		c2=c1;
		c2.id=23;
		c1.display();
	}

}
