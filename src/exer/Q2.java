package exer;

public class Q2 {
	
	public int retornaMenor(int[][] matriz){
		int menor = matriz[0][0];
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				menor = Math.min(menor, matriz[line][column]);
			}
		}
		return menor;
		
		/*int menor = 0, menorAtual = 0;
		for (int line = 0; line < matriz.length; line++) {
			for (int column = 0; column < matriz[line].length; column++) {
				menorAtual = matriz[line][column];
				if(line == 0 && column == 0){
					menor = menorAtual;
				}
				if(menorAtual < menor){
					menor = menorAtual;
				}
			}
			return menor;
		}*/
	}
}
