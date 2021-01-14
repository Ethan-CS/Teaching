package examples;

public class NumbersPyramid {

	public static void drawPyramid(int rows) {
		int k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int j = 1; j <= rows - i; ++j) {
	        System.out.print("  "); // Print spaces
	      }

	      while (k != 2 * i - 1) {
	        System.out.print(i + " "); // The number with a space after
	        k++;
	      }

	      System.out.println(); // New line
	    }
	}
	
	public static void main(String[] args) {
		drawPyramid(9);
	}

}
