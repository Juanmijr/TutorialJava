package Capítulo5;

import javax.swing.JOptionPane;

public class Ej0numAlAzarArraysumamedia {

	public static void main(String[] args) {
		int array[]= new int [150];
		int suma=0; 
		int mayor=0;
		int menor=0;

			for (int i = 0 ; i<array.length ; i++) {
				array[i]= ((int)Math.round(Math.random()*(100)));
			}
				for (int i = 0; i < array.length; i++) {
					suma= suma+array[i];
					mayor = array[i];
					menor = array[i];
					if (array[i]<mayor) {
						array[i] = mayor;
					}
					if (array[i]>mayor) {
						mayor = array[i];
					}
					if (array[i]<menor) {
						menor = array[i];
					}
					if (array[i]>menor) {
						array[i] = menor;
					}
					
	}
				JOptionPane.showMessageDialog(null, "La suma de los números es = " + suma);
				JOptionPane.showMessageDialog(null,"La media de los números es: " + ((float) suma/150));
				JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
				JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
				
	}
}
