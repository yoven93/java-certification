package com.yoven.oca.revision.overloading;

/**
 * There is a certain order of priorities that java will choose which overloaded
 * method to execute.
 * 
 * e.g. : glide(1, 2);
 * 
 * 1. Exact Match: glide(int x, int y);
 * 
 * 2. Larger Match: glide(long x, double y);
 * 
 * 3. Auto boxing: glide(Integer x, Integer y);
 * 
 * 4. var-args: glide(int... x);
 * 
 * Comment the methods and play around calling the glide method with different
 * parameters to see which one is selected.
 *
 */
public class MethodOverloading_2 {

	public static void main(String[] args) {

		glide(1, 2);
	}

//	public static void glide(int x, int y) {
//		System.out.println("Exact match called.");
//	}

	public static void glide(int x, long y) {
		System.out.println("Larger type called.");
	}

	public static void glide(Integer x, Integer y) {
		System.out.println("Autoboxing called.");
	}

	public static void glide(int... x) {
		System.out.println("var-args called.");
	}
}
