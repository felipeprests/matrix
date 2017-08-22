package estd;

import java.util.Arrays;

public class Matrixz {
	public static void main(String[] args) {
		double[][] matrix = new double[4][5];
		
		matrix[0][0] = 2;
		matrix[0][1] = 4;
		
		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				System.out.print(matrix[line][column]);
			}
		}

		

		
		//System.out.println(matrix.length);
	}
	
	
}
