package javaPuzzles;

public class Precision {
	public static void main(String... args){
		double d = 0.0d;
    		for (int i = 0; i < 10; i++) {
        		d = d + 0.1d;
    		}
    		System.out.println(d);// Expected is one but prints 0.99999999999999
	}
}
