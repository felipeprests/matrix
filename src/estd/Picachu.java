package estd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Picachu {

	public static void main(String[] args) throws Exception {
		//char[][] matrix = {{'a','b','c'},{'d','e','f'}};
		//print(matrix);
		int i = 0;
		char[][] matrix = new char[40][80];
		File file = new File("C:/work_estd_2017/matrix/p.txt");
		Scanner scaner = new Scanner(file);
		
		while (scaner.hasNext()) {
			char[] chars = scaner.nextLine().toCharArray();
			for (int j = 0; j < chars.length; j++) {
				matrix[i][j] = chars[j];
			}
			i++;
			//matrix[i++] = line.toCharArray();
		}
		print(matrix);
		flip(matrix);
		print(matrix);
	}
	
	public static void print(char[][] m){
		
		char[][] f = m.clone();		
		
		for (int line = 0; line < m.length; line++) {
			for (int column = 0; column < m[line].length; column++) {
				System.out.print(f[line][column]);
			}
			System.out.println();
		}
	}
	
	public static void flip(char[][] m){
		for (char[] cs : m) {
			for (int s = 0; s < cs.length / 2; s++) {
				char temp = cs[s];
				cs[s] = cs[cs.length - s - 1];
				cs[cs.length - s - 1] = temp;
			}
		}
	}
}
