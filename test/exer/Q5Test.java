package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {

	@Test
	public void testInvertColunas(){
		Q5 q = new Q5();
		int[][] matriz = {{1,2,3,},{4,5,6},{7,8,9}};
		int[][] expec = {{2,2,3},{5,5,6},{8,8,9}};
		q.inverteColunas(matriz);
		Assert.assertArrayEquals(expec, matriz);
	}
}
