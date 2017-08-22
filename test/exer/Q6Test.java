package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q6Test {
	
	@Test
	public void testInverteColunas(){
		Q6 q = new Q6();
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] expec = {{2,1,3},{5,4,6},{8,7,9}};
		q.inverteColunas(matriz);
		Assert.assertArrayEquals(expec, matriz);
	}
}
