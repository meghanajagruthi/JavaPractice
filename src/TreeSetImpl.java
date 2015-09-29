import java.util.TreeSet;


public class TreeSetImpl {
	
	public static void main(String args[]){
		TreeSet<String> treeset=new TreeSet<String>();
		treeset.add("one");
		treeset.add("1");
		treeset.add("Abc");
		treeset.add("AB");
		treeset.add("ABcdef");
		treeset.add("two");
		System.out.println(treeset);
	}

}
