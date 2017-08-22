package exer;

public class Q6 {
	
	public void inverteColunas(int[][] matriz){
		
		for (int i = 0; i < matriz.length; i++) {
			int temp = matriz[i][0];
			matriz[i][0] = matriz[i][1];
			matriz[i][1] = temp;
		}
	}
}
