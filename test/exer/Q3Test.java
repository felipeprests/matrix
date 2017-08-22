package exer;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {
	
	@Test
	public void testInvertSegunda(){
		Q3 q = new Q3();
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] expec = {{4,5,6},{4,5,6},{7,8,9}};
		//int[][] res = q.substituiSegundaLinha(matriz);
		q.substituiSegundaLinha(matriz);
		Assert.assertArrayEquals(expec,matriz);
	}
}
