
public class LocalInnerClass {
private int data=0;
void display(){
	int value=30;// non final variables inside the method cannot be accessed in local inner class but class variables can be accessed
	class Local{
		void msg(){
			System.out.println(data);
			//System.out.println(value);
		}
	}
	Local l=new Local();
	l.msg();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalInnerClass lo=new LocalInnerClass();
      lo.display();
	}

}
