
public class AmbigiousTypePromotion { //Here second method is called as type of second parameter is promoted to long

	public void sum(int a,long b){
		System.out.println("first method is called");
	}
	
	public void sum(long a,long b){
		System.out.println("second method is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		AmbigiousTypePromotion atp=new AmbigiousTypePromotion();
		atp.sum(0L, 0);
	}

}
