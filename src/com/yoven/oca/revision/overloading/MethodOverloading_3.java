package com.yoven.oca.revision.overloading;

/**
 * Method Overloading and Autoboxing.
 *
 * If there is more than one conversion, there will be a compile time error.
 * Note that auto unboxing does not count as a step in the conversion.
 * But auto boxing counts as a conversion step.
 * Explicit typecasting does not count as a step in the conversion.
 */
public class MethodOverloading_3 {

	public static void main(String[] args) {

	}
}


class Test_1 {
	
	public static void fly(long x) {
		
	}
}

class Test_2 {
	
	public static void fly(Long x) {
		
	}
}
