package examples; // Remember to remove this if you're importing, or place in a package called 'examples'

/**
 * Program to take a String input and append another String input to it, returning the full String
 * 
 * @author Ethan Kelly
 *
 */

public class StringAppender {

	public static String append(String original, String toAppend) {
		
		String appended = original + toAppend;
		return appended;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String appended = append("Original ", "XYZ");
		System.out.println(appended);
	}

}
