package com.yoven.oca.revision.overriding;

/**
 * Method overriding are methods that has the exact same name but different parameters (type and number of parameters)
 * from the same class or from child and parent classes. Return type, access modifiers or exceptions does not matter.
 */
public class MethodOverriding_1 {
	
	public static void main(String... args) {
		
	}
	
	
	public void fly() {
		
	}
	
	private int fly(int x) { // --> valid overloading
		return 5;
	}
	
//	public static void fly() {  
//		
//	} --> Compile time error (parameters needs to be different)


	
	
	
	
	
	
	public void fly(int[] x) {
		
	}
	
//	public void fly(int... x) {
//		
//	} --> Compile time error because int... and int[] can both take the same arguments.


	
	
	
	
	
	
	public void kill(int x) {
		
	}
	
	public void kill(Integer x) {
		
	} // --> Valid because kill(1) will call the first one and kill(new Integer(1)) will call the second one.


	
	
	
	
	
	
	// A string extends Object but this does not matter at all in method overloading
	public static void print(String s) {
		
	}
	
	public void print(Object o) {
		
	} // --> Valid because print("yoven") will call the first one and print(1) will call the second one


	
	
	
	
	
	public static void test(int i) {
		
	}
	
	public static void test(long l) {
		
	} // --> Valid because test(1) will call the first one and test(1L) will call the second one.
	// --> Note that even if test(int i) was not defined, test(1) will still be ok, since the long data type can take an integer.


	
	
	
	
	
}