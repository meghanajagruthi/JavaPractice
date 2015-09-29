import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		CopyOnWriteArrayList<Integer> test123 = new CopyOnWriteArrayList<Integer>();

		test123.add(1);
		test123.add(2);
		test123.add(3);
		test123.add(4);
        
		Iterator<Integer> iter=test123.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
