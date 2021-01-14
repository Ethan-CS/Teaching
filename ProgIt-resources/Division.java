package examples;

import java.lang.Math;

public class Division {

	public static void divide(double a, double b) {
		int divided = 0;
		double remainder = 0.0;
		
		if (a>b) {
			divided = (int) (Math.floor(a / b));
			remainder = a % b;
			System.out.println(b + " goes into " + a + " " + divided + " times, with a remainder of " + remainder);
		} else {
			divided = (int) (Math.floor(b / a));
			remainder = b % a;
			System.out.println(a + " goes into " + b + " " + divided + " times, with a remainder of " + remainder);
		}
		
	}
	
	public static void main(String[] args) {
		divide(2.5, 9.0);
		divide(3.0, 15.5);
	}

}
