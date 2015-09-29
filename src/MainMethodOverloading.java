
public class MainMethodOverloading {

	public static void main(){
		System.out.println("inside overloaded main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		for(String i:args){
			System.out.println(i);
		}
		main();

	}

}
