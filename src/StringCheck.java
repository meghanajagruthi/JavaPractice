
public class StringCheck {

	 public static void main(String args[]) {
	        String s1 = "Hello";
	        StringBuffer sb = new StringBuffer(s1);
	        sb.reverse();
	        s1.concat(sb.toString());
	        System.out.println(s1);
	        System.out.println(s1 + sb + s1.length() + sb.length());
	    }
}
