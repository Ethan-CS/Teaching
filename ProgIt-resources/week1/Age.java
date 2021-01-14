package examples;

/**
 * Week 1 Exercise 4.4-6.
 * Calculate how many whole years old a person is given their birth-date.
 * 
 * @author Ethan Kelly
 *
 */

import java.time.LocalDate;
import java.time.Period;

class Age {

	public static int calculateAge(LocalDate birthDate) {
		LocalDate currentDate = LocalDate.now(); // Today's date
		
		if ((birthDate != null) && (currentDate != null)) {
			return Period.between(birthDate, currentDate).getYears(); // Gets the period between the date provided and today
		} else {
			return 0; // In case the date provided was null
		}
	}

	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1912, 06, 23); // Alan Turing's Birthday
		
		int alanTuringAge = calculateAge(birthDate); // Calculating how long ago Turing was born

		System.out.println("Alan Turing was born " + alanTuringAge + " years ago.");
	}
}
