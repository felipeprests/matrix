package exer;

import org.junit.Assert;
import org.junit.Test;



public class Q2Test {
	
	@Test
	public void testRetornaMenor(){
		Q2 q = new Q2();
		int[][] matriz = {{9,2,3},{4,5,6}};
		int res = q.retornaMenor(matriz);
		Assert.assertEquals(2, res);
	}
}
