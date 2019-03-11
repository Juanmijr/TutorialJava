package bloque04;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		int Array1 [] = hazArray();
		imprimeArray(Array1);
		analisisArray(Array1);

	}

	private static int[] hazArray () {
		int Array1[] = new int [(int) Math.round(Math.random()*100)];
		
		for(int i = 0; i<Array1.length;i++) {
			Array1[i]= (int)( Math.round(Math.random()*100));
			
		}
		return Array1;
	}
	
	private static void imprimeArray(int Array1[]) {
		for(int i = 0; i<Array1.length;i++) {
			System.out.print(Array1[i]+ " ");
		}
		
	}
	
	private static void analisisArray(int Array1[]) {
		//PAR
		if (Array1.length%2 == 0) {
			JOptionPane.showMessageDialog(null,(-1));
		}
		//IMPAR
		else {
			JOptionPane.showMessageDialog(null,"Valor central del array: "+ (Array1[(Array1.length/2)]));
		}
	}
}
