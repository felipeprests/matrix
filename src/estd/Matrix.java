package estd;

public class Matrix {

	public double[][] generateMatrix(double a[][]){

		double[][] res = a.clone();
		
		for (int line = 0; line < res.length; line++) {
			for (int column = 0; column < res[line].length; column++) {
				
				res[line][column] =  Math.pow(res[line][column], 2);
			}
		}
		return res;
	}
}
