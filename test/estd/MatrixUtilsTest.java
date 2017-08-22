package estd;

import org.junit.Assert;
import org.junit.Test;

public class MatrixUtilsTest {

	@Test
	public void testPow(){
		Matrix matrix = new Matrix();
		double ma[][] = {{1,2,3}, {4,5,6}};
		double result[][] = matrix.generateMatrix(ma);
		double expect[][] = {{1,4,9}, {16, 25, 36}};
		
		Assert.assertArrayEquals(expect, result);
	}
}
