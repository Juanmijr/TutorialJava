package Capítulo3;

import javax.swing.JOptionPane;

public class EjercicioCCB37 {

	public static void main(String[] args) {
		int num = -1, contPos=0, contNeg=0; 

		for (;num !=0;) {
			num=Integer.parseInt(JOptionPane.showInputDialog("INTRODRUZCA NÚMERO (0->TERMINAR"));
			
			if (num<0) {
				contNeg++;
			}
			if(num>0){
				contPos++;
			}
		}
		JOptionPane.showMessageDialog(null, "HAY " + contNeg + "NUMEROS NEGATIVOS Y " + contPos + "NÚMEROS POSITIVOS.");
	}

}
