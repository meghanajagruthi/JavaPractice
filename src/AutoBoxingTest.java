public class AutoBoxingTest {

	public static void main(String args[]) {

		// Example 1: == comparison pure primitive – no autoboxing
		int i1 = 1;
		int i2 = 1;
		System.out.println("i1==i2 : " + (i1 == i2)); // true

		// Example 2: equality operator mixing object and primitive
		Integer num1 = 150; // autoboxing
		int num2 = 150;
		System.out.println("num1 == num2 : " + (num1 == num2)); // true

		// Example 3: special case - arises due to autoboxing in Java
		Integer obj1 = 150; // autoboxing will call Integer.valueOf()
		Integer obj2 = 150; // same call to Integer.valueOf() will return same
							// cached Object.This condition is true only if the
							// value ranges between -128 to 128 values outside
							// this range return false. Integer.valuOf()  method caches values so it returns sam Integer object from heap This is so happens that jvm does some optimization to some range of values

		System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true.... Here memory address comparision is happening not auto unboxing

		// Example 4: equality operator - pure object comparison
		Integer one = new Integer(1); // no autoboxing
		Integer anotherOne = new Integer(1);
		System.out.println(one);
		System.out.println(anotherOne);
		System.out.println("one == anotherOne : " + (one == anotherOne)); // false
		System.out.println("one == anotherOne : " + (one == 1)); // true In the
																	// comparision
																	// if any
																	// one the
																	// variables
																	// are of
																	// type
																	// primitive
																	// then auto
																	// unboxing
																	// occurs
	}

}
