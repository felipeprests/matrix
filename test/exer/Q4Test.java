package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {
	
	@Test
	public void testInvert(){
		Q4 q = new Q4();
		
		int[][] expec = {{4,5,6},{1,2,3},{7,8,9}};
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		q.invertePrimeiraSegunda(matriz);
		
		Assert.assertArrayEquals(expec, matriz);
	}
}
