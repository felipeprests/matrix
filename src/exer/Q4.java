package exer;

public class Q4 {
	public void invertePrimeiraSegunda(int[][] matriz){
		
		for (int i = 0; i < matriz[0].length; i++) {
			int temp = matriz[0][i];
			matriz[0][i] = matriz[1][i];
			matriz[1][i] = temp;
		}
	}
}
