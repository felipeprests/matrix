package exer;

public class Q3 {

	public void substituiSegundaLinha(int[][] matriz){
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[0][i] = matriz[1][i];
		}
		/*return matriz;*/
	}
}
