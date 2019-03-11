package bloque04;

import javax.swing.JOptionPane;

public class ejercicio4 {
	public static int contadorPositivos;
	public static void main(String[] args) {
		int Array1 [][]= hazArray();
		int Array2 [][]= hazArray();
		imprimeArray(Array1);
		System.out.println("\n ¿La matriz es positiva? " + esPositiva(Array1));
		System.out.println("\n ¿La matriz es diagonal? " + esDiagonal(Array1));
		System.out.println("\n ¿La matriz es triangular? " + esTriangular(Array1));
		System.out.println("\n ¿La matriz es dispersa? " + esDispersa(Array1));
	}
	/**
	 * 
	 * @return
	 */

	private static int[][] hazArray () {
		//int Array1[][] = new int [5][5];
		
	//	for(int i = 0; i<Array1.length;i++) {
		//	for(int j=0; j<Array1[i].length;j++) {
			//	Array1[i][j] = (int)Math.round(Math.random()*(100 - (-100)) + (-100));
				
		//	}		
	//	}
		
		int Array1[][] = new int[][] {
			{0,	2,	3, 	4, 	5},
			{0, 1,	8,	7,	6},
			{0, 0, 	1,	9, 	0},
			{0, 0, 	0,  1, 	4},
			{0, 0, 	0, 	0, 	0}
		};
		
		
		return Array1;
	}
	/**
	 * 
	 * @param Array1
	 */
	public static boolean esPositiva (int Array1[][]) {
		for(int i = 0; i<Array1.length;i++) {
			for(int j=0; j<Array1[i].length;j++) {
		if (Array1[i][j]>= 0) {
			contadorPositivos++;
			}
		}
	}
		if (contadorPositivos == 25) {
			return true;
		}
		return false;
}
	/**
	 * 
	 * @param Array1
	 */
	public static void imprimeArray (int Array1[][]) {
		for (int i = 0; i < Array1.length; i++) {
			for (int j = 0; j < Array1[i].length; j++) {
				System.out.print(Array1[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static boolean esDiagonal (int Array1[][]) {
		
		for(int i = 0; i<Array1.length;i++) {
			for(int j=0; j<Array1[i].length;j++) {
		
		if (i!=j) {
			if(Array1[i][j]!=0) {
				return false;
			}
			
		}
		if (i == j) {
			if (Array1[i][j]==0) {
				return false;
			}
			}
		
		}
	}
return true;
	}
	
	public static boolean esTriangular (int Array1[][]) {
		for(int i = 0; i<Array1.length;i++) {
			for(int j=0; j<Array1[i].length;j++) {
				if (i>j) {
					if (Array1[i][j]== 0)
						return true;
				}
		}
	}
		
		return false;
}
	
	public static boolean esDispersa(int Array1[][]) {
		int contador=0;
		int i = 0;
		int j = 0;
		for(i= 0; i<Array1.length;i++) {
			if (Array1[i][j]==0) {
				contador++;
				i++;
			}
		}

			for(j=0, i=0; j<Array1[0].length;j++) {
				if(Array1[i][j]==0) {
					contador++;
					j++;
				}
				
		}

			if(contador == 10) {
				return true;
			}
			return false; 
	}
	
	
}


