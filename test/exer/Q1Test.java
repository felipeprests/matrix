package exer;

import org.junit.Assert;
import org.junit.Test;



public class Q1Test {
	
	@Test
	public void testSoma(){
		Q1 q = new Q1();
		int[][] matriz = {{1,2,3},{4,5,6}};
		int res = q.somaTodos(matriz);
		Assert.assertEquals(21, res);
	}
}
