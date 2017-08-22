package exer;

public class Q5 {
	
	public void inverteColunas(int[][] matriz){
		
		for (int line = 0; line < matriz.length; line++) {
			matriz[line][0] = matriz[line][1];
		}
	}
}
