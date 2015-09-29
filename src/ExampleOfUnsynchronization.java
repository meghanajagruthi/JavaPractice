public class ExampleOfUnsynchronization {

	private static int count = 0;

	public static synchronized int getCount() {
		return count;
	}

	public synchronized void setCount(int count) {
		this.count = count;
		System.out.println("This is count "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ExampleOfUnsynchronization eou=new ExampleOfUnsynchronization();
      eou.setCount(5);
      System.out.println("-----------------------");
      System.out.println(ExampleOfUnsynchronization.count);
	}

}
