
public class ThisUsage {
	
	void m(ThisUsage obj){
		System.out.println("This method is invoked");
	}

	void p(){
		m(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThisUsage th=new ThisUsage();
      th.p();
	}

}
