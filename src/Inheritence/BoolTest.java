public class BoolTest 
{
    public static void main(String [] args) 
    {
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        System.out.println("The contents");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("The conditions");
        System.out.println(  (b1 == b2) );
        System.out.println(b1.equals(b2));
        System.out.println(b2 == b4);
        System.out.println(b2.equals(b4));
        System.out.println(b2.equals(b3));
        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);
    }
}