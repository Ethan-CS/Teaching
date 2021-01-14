package examples;

/**
 * Week 1 Exercise 4.3.
 * Write a program that, given a particular year,
 * Determines whether it is a leap year or not.
 * 
 * @author Ethan Kelly
 *
 */

public class LeapYearCheck {

	public static boolean leapCheck(int year) {
		boolean isLeapYear = false;

		// Year divisible by 4?
		if (year % 4 == 0) {
			// Year divisible by 100 i.e. a century?
			if (year % 100 == 0) {
				// Year divisible by 400?
				if (year % 400 == 0) {
					// Then it is a leap year!
					isLeapYear = true;
				} else {
					// Otherwise, not a leap year!
					isLeapYear = false;
				}
			} else {
				// If the year is not a century
				isLeapYear = true;
			}
		} else {
			// if the year is not divisible by 4
			isLeapYear = false;
		}

		return isLeapYear;
	}

	public static void main(String[] args) {

		// Year to check
		int year = 2100;
		boolean leap = leapCheck(year);

		if (leap) {// If the leap check method returns true
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
