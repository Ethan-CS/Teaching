package examples;

/**
 * Week 1 Exercise 6.1-2.
 * For a given integer, print the first 10 terms of its times table.
 * 
 * @author Ethan Kelly
 *
 */

import java.util.Arrays;

public class TimesTable {

	public static int[] tableGenerator(int n) {
		// Create a new array of size 10
		int[] table = new int[10];

		// Each element is n times the index plus 1 (as indices start at 0)
		for (int i = 0; i < 10; i++) {
			table[i] = n * (i+1);
		}
		
		// Print the array
		System.out.println("The first ten elements of the times table for " + n + " are " + Arrays.toString(table));
		
		// Returns the table array, in case we want to use it later
		return table;
	}
	
	public static void main(String[] args) {
		// To test the first 10 integers in the above table generator
		for (int i = 1; i <= 10; i++) {
			tableGenerator(i);
		}
		
	}

}
