package arrays;

public class MultiDimensionalArray {
	
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n]; // Only need to specify first dimension
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				matrix[i][i + j] = j + 1;
			}
		}
		return matrix;
	}
	
	public static void drawMatrix(int[][] matrix) {
		int n = matrix.length;
		
		for (int i = 0; i < n; i++) {
			String toPrint = "";
			for(int j = 0; j < n; j++) {
				toPrint += matrix[i][j] + " ";
			}
			System.out.println(toPrint);
		}
	}
	
	public static void main(String[] args) {
		
		drawMatrix(generateMatrix(6));
		
	}

}
