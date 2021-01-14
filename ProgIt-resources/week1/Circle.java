package examples;

/**
 * Week 1 Exercise 3
 * Write three methods: calculate area, calculate circumference and 
 * Print calculations to the console.
 * 
 * @author Ethan
 *
 */

public class Circle {
	
	// Define pi here as a 'field' so we can use it more than once
	public static final double pi = 3.14159265359; 
	
	// Calculates the circumference of a circle given a radius
	public static double compCircumference(double radius) {
		// Circumference is (2*pi*r)
		double circumference = 2 * pi * radius;
		return circumference;
	}
	
	// Calculates the area of a circle given a radius
	public static double compArea(double radius) {
		// Area is (pi*r^2)
		double area = pi * radius * radius;
		return area;
	}
	
	// Uses above 'helper' methods to get area and circumference of a circle given a radius,
	// Prints these values to the console
	public static void summariseCircle(double radius) {
		// Calculate the circumference and area
		double circumference = compCircumference(radius);
		double area = compArea(radius);
		
		// Use above calculations to print info about circle to the console
		System.out.print("A circle with radius ");
		System.out.print(radius);
		System.out.print(" has circumference ");
		System.out.print(circumference);
		System.out.print(" and area ");
		System.out.print(area);
		System.out.println();
		
		// You can type the above all into one println command, like so:
		//System.out.println("A circle with radius " + radius + " has circumference " + circumference + " and area " + area);
		
	}
	
	
	
	public static void main(String[] args) {
		double radius = 5.5; // Give the radius to be used in calculations
		
		summariseCircle(radius); // All we need to do is summarise the circle, that method calls the other two and prints all by itself!
		
	}

}
