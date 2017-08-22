package exer;

public class Q1 {
	
	public int somaTodos(int[][] matriz){
		int total = 0;
		
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				total += matriz[line][column];
			}
		}
		return total;
	}
}
